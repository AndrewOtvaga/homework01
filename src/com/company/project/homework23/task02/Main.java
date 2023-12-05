package com.company.project.homework23.task02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] fileNames = {"file1.txt", "file2.txt", "file3.txt", "file4.txt"};
        Map<String, Set<Product>> productsMap = new HashMap<>();

        List<Thread> threads = new ArrayList<>();

        for (String fileName : fileNames) {
            Thread thread = new Thread(new FileHandler(fileName, productsMap));
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Map.Entry<String, Set<Product>> entry : productsMap.entrySet()) {
            String productName = entry.getKey();
            Set<Product> products = entry.getValue();
            List<Product> sortedProducts = new ArrayList<>(products);
            sortedProducts.sort(Comparator.comparingInt(Product::getPrice));
            productsMap.put(productName, new LinkedHashSet<>(sortedProducts));
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            for (Map.Entry<String, Set<Product>> entry : productsMap.entrySet()) {
                String productName = entry.getKey();
                Set<Product> products = entry.getValue();
                for (Product product : products) {
                    writer.write(product.getId() + ":" + product.getQuantity() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Product {
    private String id;
    private String name;
    private int price;
    private int quantity;

    public Product()
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class FileHandler implements Runnable {
    private String fileName;
    private Map<String, Set<Product>> productsMap;

    public FileHandler(String fileName, Map<String, Set<Product>> productsMap) {
        this.fileName = fileName;
        this.productsMap = productsMap;
    }

    @Override
    public void run() {
        Set<Product> products = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("::");
                Product product = new Product();
                product.setId(parts[0]);
                product.setName(parts[1]);
                product.setPrice(Integer.parseInt(parts[2]));
                product.setQuantity(Integer.parseInt(parts[3]));
                products.add(product);
            }
            productsMap.put(fileName, products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

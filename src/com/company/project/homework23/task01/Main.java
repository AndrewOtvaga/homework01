package com.company.project.homework23.task01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String[] fileNames = {"file1.txt", "file2.txt", "file3.txt", "file4.txt"};

        for (String fileName : fileNames) {
            new Thread(new FileHandler(fileName)).start();
        }
    }
}

class FileHandler implements Runnable {
    private String fileName;

    public FileHandler(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("::");
                int priority = Integer.parseInt(parts[1]);
                if (priority >= 7) {
                    System.out.println(line);
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File " + fileName + " contains " + count + " messages with priority 7 and above");
    }
}
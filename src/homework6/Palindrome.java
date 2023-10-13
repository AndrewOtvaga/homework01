package homework6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Ввводим строку(подобная задачка была на хекслете, там уже подобное решал)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();
        scanner.close();

        // Удалил все символs, привёл к нижнему регистру
        String cleanString = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Создаю новую строку из исходной с помощью reverse()
        String reversedString = new StringBuilder(cleanString).reverse().toString();

        // Сравниваю
        if (cleanString.equals(reversedString))
        {
            System.out.println("Строка является палиндромом.");
        }
        else
        {
            System.out.println("Строка не является палиндромом.");
        }
    }
}

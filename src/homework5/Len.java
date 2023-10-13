package homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    public class Len
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            // Input the size of the array
            System.out.print("Введите размер массива: ");
            int len = scanner.nextInt();

            // Create the array
            int[] array = new int[len];

            // Fill the array with random integers
            Random random = new Random();
            for (int i = 0; i < len; i++)
            {
                array[i] = random.nextInt();
            }

            // Calculate the maximum, minimum, and average values
            int max = Arrays.stream(array).max().getAsInt();
            int min = Arrays.stream(array).min().getAsInt();
            double average = Arrays.stream(array).average().getAsDouble();

            // Display the results
            System.out.println("Максимальное значение: " + max);
            System.out.println("Минимальное значение: " + min);
            System.out.println("Среднее арифметическое значение: " + average);
        }
    }


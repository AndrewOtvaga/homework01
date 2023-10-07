package homework4SoHard;

import java.util.Scanner;

public class WhileFirstVersion
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int number = scanner.nextInt();

        int sum = 0;
        int temp = number;

        while (temp > 0)
        {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Сумма всех цифр в числе: " + sum);
    }
}

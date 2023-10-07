package homework4SoHard;

import java.util.Scanner;
public class While
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int num = scanner.nextInt();

        int sum = 0;
        int step = num;

        while (step > 0)
        {
            sum += step % 10;
            step /= 10;
        }
        System.out.println("Cумма всец цифр в числе = " + sum);
    }
}

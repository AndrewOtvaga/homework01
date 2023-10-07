package homework4SoHard;

import java.util.Scanner;

public class While
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");

        if (scanner.hasNextInt())
        {
            int num = scanner.nextInt();

            if (num > 0)
            {
                int sum = 0;
                int step = num;

                while (step > 0)
                {
                    sum += step % 10;
                    step /= 10;
                }

                System.out.println("Сумма всех цифр в числе: " + sum);
            }
            else
            {
                System.out.println("Вы ввели неположительное число");
            }
        }
        else
        {
            System.out.println("Вы ввели некорректное значение");
        }
    }
}

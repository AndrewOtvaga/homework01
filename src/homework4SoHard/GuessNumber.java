package homework4SoHard;

import java.util.Scanner;
public class GuessNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int computerNumber = (int) (Math.random() * (9 - 1 + 1) + 1);

        while (true) //ради интереса написал проверить работает/ нет
        {
            System.out.println("Введите число (0 для выхода): ");
            int input = scanner.nextInt();

            if (input == 0)
            {
                System.out.println("Выход");
                break;
            }
            else if (input == computerNumber)
            {
                System.out.println("Угадал, поздравляю!");
                break;
            }
            else if (input > computerNumber)
            {
                System.out.println("Компьютер загадал меньше, попробуй снова");
            }
            else
            {
                System.out.println("Компьютер загадал больше, попробуй снова");
            }
        }
    }
}

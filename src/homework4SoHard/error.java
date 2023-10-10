package homework4SoHard;

import java.util.Scanner;
public class error
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int computerAnswer;

        System.out.println("Загадай число от 1 до 100");

        while (true)
        {
            computerAnswer = (min + max) / 2;
            System.out.println("Число = " + computerAnswer + "?");
            System.out.println("Введите 1, если меньше, 2 - если больше или 3 - если угадано");
            int yourAnswer = scanner.nextInt();

            if (yourAnswer == 1)
            {
                max = computerAnswer - 1;
                {
                   // else if (yourAnswer == 2)
                {
                    min = computerAnswer + 1;
                }
                //else if (yourAnswer == 3)
                {
                    System.out.println("Ура! Я угадал число");
                    break;
                }

                }
            }
        }

    }
}
package homework5;
import java.util.Scanner;
public class MassiveFive
{
    public static void main(String[] args)
    {
        int[] massive1 = new int[5];
        int[] massive2 = new int[5];
        int index1 = 0;
        int index2 = 0;

        Scanner scanner = new Scanner(System.in);

        while (index1 < massive1. length && index2 < massive2.length)
        {
            System.out.println("Нажмите 0 для завершения");
            int number = scanner.nextInt();

            if(number == 0)
            {
                break;
            }
            else if (number < 0)
            {
                massive1[index1] = number;
                index1++;
            }
            else
            {
                massive2[index2] = number;
                index2++;
            }
            System.out.println("Массив №1:");
            for (int i = 0; i < index1; i++)
            {
                System.out.println(massive1[i]);
            }
            System.out.println("Массив №2:");
            for (int i = 0; i < index2; i++)
            {
                System.out.println(massive2[i]);
            }
        }

    }
}

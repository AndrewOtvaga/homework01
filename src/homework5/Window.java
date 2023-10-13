package homework5;

public class Window
{
    public static void main(String[] args)
    {
        int[] task04 = {88, 34, 12, 55, 90, 4, 10, 44};
        int target = 150;
        int wStart = 0;
        int arrSum = 0;
        int arrLen = 10000;
        for (int wEnd = 0; wEnd < task04.length; wEnd++)
            {
               arrSum += task04[wEnd];
               while (arrSum >= target)
               {
                   arrLen = Math.min(arrLen, wEnd - wStart + 1);
                   arrSum -= task04[wStart];
                   wStart++;

               }

            }
        System.out.println("Максимальная сумма четырех смежных чисел: " + arrLen);
    }
}
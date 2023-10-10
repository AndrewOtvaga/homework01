package homework5;

public class FromTentoOneHundreed
{
    public static void main(String[] args)
    {
        int[] numbers = new int[15];
        //Заполняю четными числами от 1 до 100
        int begin = 10;
        for (int i = 0; i < numbers.length;i++)
        {
            numbers[i] = begin;
            begin += 2;
        }
        for (int i = 0; i < numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }
    }
}

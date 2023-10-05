package homework3;

public class Position
{
    public static void main(String[] args)
    {
        double x = Math.random() * 101 - 50; // случайное значение (-50 +50) можно увеличить при необходимости
        double y = Math.random() * 101 - 50; // аналогично

        if (x > 0 && y > 0)
        {
            System.out.println("Первая четверть");
        }
        else if (x < 0 && y > 0)
        {
            System.out.println("Вторая четверть");
        }
        else if (x < 0 && y < 0)
        {
            System.out.println("Третья четверть");
        }
        else if (x > 0 && y < 0)
        {
            System.out.println("Четвертая четверь");
        }
        else
        {
            System.out.println("Точка на одной из осей");
        }
    }
}
/*Я решил эту задачу, но у меня по ней есть вопрос, пока писал, если поставить заместо типа данных тип int
всегда будет выпадать 3-я четверть, я просто не могу понять почему, а может я уже хочу спать*/
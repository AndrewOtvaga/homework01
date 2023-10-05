package homework3;

public class CurrentScore
{
    public static void main(String[] args)
    {
        //Задаю переменную currentScoreValue, применяю math.random
    int currentScoreValue = (int) ((Math.random() * (90 - 70 + 1)) + 70);
        //Перебираю возможные варианты
    if (currentScoreValue >= 90)
        {
            System.out.println("Вы набрали " + currentScoreValue + " и заняли 1-е место!");
        }
    else if (currentScoreValue <= 89 && currentScoreValue >= 80)
        {
            System.out.println("Вы набрали " + currentScoreValue + " и заняли 2-е место!");
        }
    else if (currentScoreValue <= 79 && currentScoreValue >= 70)
        {
            System.out.println("Вы набрали " + currentScoreValue + " и заняли 3-е место!");
        }
    else
        {
            System.out.println("Вы набрали " + currentScoreValue + " и не заняли призового места!");
        }

    }
}

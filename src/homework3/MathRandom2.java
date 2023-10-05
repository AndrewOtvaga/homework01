package homework3;

public class MathRandom2 {
    public static void main(String[] args)
    {
        // Генериратор [10;500]
        int randomNumber = generateRandomNumber(10, 500);

        // Проверка (25;200)
        if (randomNumber > 25 && randomNumber < 200)
        {
            System.out.println("Сгенерированное число " + randomNumber + " попало в интервал (25;200).");
        } else
        {
            System.out.println("Сгенерированное число " + randomNumber + " не попало в интервал (25;200).");
        }
    }

    // Метод для генерации случайного целого числа в заданном диапазоне
    public static int generateRandomNumber(int min, int max)
    {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}

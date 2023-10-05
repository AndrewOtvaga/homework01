package homework3;

public class MathRandom {
    public static void main(String[] args) {
        // Генерируем случайное целое число из отрезка [10;500]
        var randomNumber = (Math.random() * (500 - 10 + 1)) + 10;

        // Проверяем, попало ли число в интервал (25;200)
        if (randomNumber > 25 && randomNumber < 200) {
            System.out.println("Сгенерированное число " + randomNumber + " попало в интервал (25;200).");
        } else {
            System.out.println("Сгенерированное число " + randomNumber + " не попало в интервал (25;200).");
        }
    }

}

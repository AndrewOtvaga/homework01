package homework5;

public class window
{
        public static void main(String[] args)
        {
            int[] task04 = {88, 34, 12, 55, 90, 4, 10, 44};

            // Инициализация начальных значений
            int windowSize = 4;
            int maxSum = Integer.MIN_VALUE;

            // Обход массива с использованием скользящего окна
            for (int i = 0; i <= task04.length - windowSize; i++)
            {
                int currentSum = 0;

                // Вычисление суммы смежных чисел в окне на данный момент
                for (int k = i; k < i + windowSize; k++)
                {
                    currentSum += task04[k];
                }

                //  Значения максимальной суммы
                if (currentSum > maxSum)
                {
                    maxSum = currentSum;
                }
            }

            //  Результат
            System.out.println("Максимальная сумма четырех смежных чисел: " + maxSum);
        }
}


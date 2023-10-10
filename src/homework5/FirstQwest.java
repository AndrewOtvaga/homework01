package homework5;

import java.util.Arrays;

public class FirstQwest
{
    public static void main(String[] args) {
        //Arrays.equals(...) - возвращает true, если два массива равны например
        int[] massive = {1, 2, 3};
        int[] massive2 = {1, 2, 3};
        //то есть просто одинаковое количество и значение элементов массива - тру
        boolean equals = Arrays.equals(massive, massive2);
        System.out.println(equals);
        /*Arrays.compare() - сравнивает два(? а че так мало-то?) массива лексикографически
        Если равны- возращает 0, если первый БОЛЬШЕ второго возращает положительное числое
        Если первый массив МЕНЬШЕ вернёт отрицательное число
         */
        int[] massive3 = {1, 2, 4};

        int compare = Arrays.compare(massive, massive3);
        System.out.println(compare);

    }
}

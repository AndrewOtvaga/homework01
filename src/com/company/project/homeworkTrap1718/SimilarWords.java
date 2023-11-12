package com.company.project.homeworkTrap1718;

import java.util.*;//пару занятий назад Вы показывали такую штуку
                    //вообще не знаю, читаете ли мои "заметки на полях"
                    //если читаете - дайте знать)

public class SimilarWords
{
    public static Map<String, Long> similarMoment(Collection<String> strings)
    {
        Map<String, Long> similar = new HashMap<>();
        //Объявляю статический метод similarMoment,
        // который принимает кол-ю строк Collection<String> strings в качестве параметра.
        // Метод возвращает карту Map<String, Long>, где ключами являются уникальные слова,
        // а значениями - кол-во повторений.
        //
        //Внутри метода создаю новую пустую карту similar с типом HashMap<String, Long>.
        // В этой карте сохраняются слова и кол-во их повторений.
        for (String string : strings)
        {
            String[] words = string.split(" ");
            //Перебираю каждую строку в кол-и strings с помощью цикла for-each.
            // Для каждой строки применяю метод split(" "), чтобы разделить строку на отдельные слова.
            // Результат разделения сохраняется в массиве строк words.
            for (String word : words)
            {
                if (similar.containsKey(word))
                {
                    similar.put(word, similar.get(word) + 1);
                }
                else
                {
                    similar.put(word, 1L);
                }
                //Проверяю, содержится ли уже это слово в карте similar.
                // Если слово уже есть в карте, + 1, используя метод put(word, duplicates.get(word) + 1).
                // Если слова еще нет в карте, добавляю как новый ключ с начальным значением 1 с помощью метода put(word, 1L).
                // 1L, чтобы указать, что это число типа Long иначе компилятор ругается.

            }
        }

        return similar;
    }
}

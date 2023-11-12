package com.company.project.homeworkTrap1718;

import java.util.*;


public class FrequencyMeeting
{
    //логика такая- же как в первой задаче только тут две переменных типа стринг
    public static Map<String, Long> countWordFrequency(String word, String text)
    {
        Map<String, Long> frequencyMap = new HashMap<>();
        String[] words = text.split(" ");

        for (String w : words)
        {
            // Удаляем знаки препинания и приводим слова к нижнему регистру
            String cleanWord = w.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();

            if (!cleanWord.isEmpty())
            {
                if (frequencyMap.containsKey(cleanWord))
                {
                    frequencyMap.put(cleanWord, frequencyMap.get(cleanWord) + 1);
                }
                else
                {
                    frequencyMap.put(cleanWord, 1L);
                }
            }
        }

        return frequencyMap;
    }

    //Демонстрация работы метода
    public static void main(String[] args)
    {
        String word = " ";
        String text = " ";

        Map<String, Long> frequencyMap = countWordFrequency(word, text);

        System.out.println(frequencyMap);
    }
}

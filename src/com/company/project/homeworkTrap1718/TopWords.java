package com.company.project.homeworkTrap1718;
import java.util.*;
public class TopWords
{
    public static void countTopWords(String text)
    {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = text.toLowerCase().split("\\W+");

        // \\w++ - это регулярное выражение

        Set<String> ignorWords = new HashSet<>(Arrays.asList("a", "an", "the", "in", "on", "at", "to", "for", "by", "of"));
        for (String word : words)
        {
            if (!ignorWords.contains(word))
            {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        List<Map.Entry<String, Integer>> wordCountList = new ArrayList<>(wordCountMap.entrySet());
        Collections.sort(wordCountList, (a, b) -> b.getValue().compareTo(a.getValue()));
        int count = 0;
        for (Map.Entry<String, Integer> entry : wordCountList)
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            count++;
            if (count == 10)
            {
                break;
            }
        }

    }
    public static void main(String[] args)
    {
        String text = "";

        countTopWords(text);
    }
}





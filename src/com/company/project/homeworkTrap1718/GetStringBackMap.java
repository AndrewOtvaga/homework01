package com.company.project.homeworkTrap1718;
import java.util.*;
public class GetStringBackMap
{
  public static Map <Integer, List <String>> countWordLength (String text)
  {
      Map <Integer, List <String>> wordLengthMap = new HashMap<>();
      String[] words = text.split(" ");
      for (String word : words)
      {
          int wordLength = word.length();
          if (!wordLengthMap.containsKey(wordLength))
          {
              wordLengthMap.put(wordLength, new ArrayList<>());
          }
          wordLengthMap.get(wordLength).add(word);
      }
      return wordLengthMap;
  }

    public static void main(String[] args)
    {
     String text = " ";
     Map <Integer, List<String>> wordLengthMap = countWordLength(text);
        System.out.println(wordLengthMap);
    }
}

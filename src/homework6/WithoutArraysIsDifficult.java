package homework6;
/*
public class WithoutArraysIsDifficult {
    public static void main(String[] args) {
        String str1 = "строка";
        String str2 = "торкса";

        boolean isAnagram = checkAnagram(str1, str2);

        if (isAnagram) {
            System.out.println("Строки являются анаграммами.");
        } else {
            System.out.println("Строки не являются анаграммами.");
        }
    }

    public static boolean checkAnagram(String str1, String str2) {
        // Приводим строки к нижнему регистру и удаляем пробелы
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        // Проверяем, имеют ли строки одинаковую длину
        if (str1.length() != str2.length()) {
            return false;
        }

        // Создаем массивы для хранения частот символов
        int[] charCount1 = new int[26];
        int[] charCount2 = new int[26];

        // Подсчитываем частоты символов в первой строке
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (Character.isLetter(c)) {
                charCount1[c - 'a']++;
            }
        }

        // Подсчитываем частоты символов во второй строке
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (Character.isLetter(c)) {
                charCount2[c - 'a']++;
            }
        }

        // Сравниваем частоты символов
        for (int i = 0; i < 26; i++) {
            if (charCount1[i] != charCount2[i]) {
                return false;
            }
        }

        return true;
    }
}
*/
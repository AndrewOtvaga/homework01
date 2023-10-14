package homework6;
/*
public class WithoutArraysIsDifficult {
    public static void main(String[] args) {
        String str1 = "шкаф";
        String str2 = "факш";

        boolean isAnagram = checkAnagram(str1, str2);

        if (isAnagram) {
            System.out.println("Строки - анаграммы.");
        } else {
            System.out.println("Строки не анаграммы.");
        }
    }

    public static boolean checkAnagram(String str1, String str2) {
        // Привожу строки к нижнему регистру и удаляю пробелы
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        // Проверяю, имеют ли строки одинаковую длину
        if (str1.length() != str2.length()) {
            return false;
        }

        // Создаю массивы для хранения частот символов
        int[] charCount1 = new int[26];
        int[] charCount2 = new int[26];

        // Подсчитываю частоты символов в первой строке
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (Character.isLetter(c)) {
                charCount1[c - 'a']++;
            }
        }

        // Подсчитываю частоты символов во второй строке
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (Character.isLetter(c)) {
                charCount2[c - 'a']++;
            }
        }

        // Сравниваю частоты символов
        for (int i = 0; i < 26; i++) {
            if (charCount1[i] != charCount2[i]) {
                return false;
            }
        }

        return true;
    }
}
*/
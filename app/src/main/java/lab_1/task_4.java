package lab_1;

import java.util.ArrayList;

public class task_4 {
    static boolean hasDoubledLetters(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    static String[] processText(String text) {
        String[] words = text.replaceAll("[.,!?]", "").split("\\s+");
        ArrayList<String> wordsWithDoubles = new ArrayList<>();
        ArrayList<String> remainingWords = new ArrayList<>();
        for (String word : words) {
            if (hasDoubledLetters(word)) {
                wordsWithDoubles.add(word);
            } else {
                remainingWords.add(word);
            }
        }
        String doubledWords = String.join(" ", wordsWithDoubles);
        String remainingText = String.join(" ", remainingWords);
        return new String[] { doubledWords, remainingText };
    }

    public static void main() {
        String text = "Hello, good afternoon. I need coffee soon! The book is excellent.";
        String[] result = processText(text);
        System.out.println(":" + text);
        System.out.println(":" + result[0]);
        System.out.println(":" + result[1]);
    }
}
/*
    Задано текст, слова в якому розділені пробілами і розділовими знаками.
    Розробити програму, яка вилучає з цього тексту
    всі слова з подвоєнням літер і записує їх в окремий рядок, розділяючи пробілами.
    Друкує окремо вилучені слова і текст, що залишився після вилучення слів.
*/
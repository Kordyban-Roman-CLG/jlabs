package lab_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class task_2 {
    public static int countWordsInFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        int totalWordCount = 0;

        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (!line.isEmpty()) {
                String[] words = line.split("\\s+");
                totalWordCount += words.length;
            }
        }
        reader.close();
        return totalWordCount;
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input file name: ");
        String filename = scanner.nextLine();
        if (filename == "") {
            filename = "lab_4_2.txt";
        }
        int wordCount = -1;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            int totalWordCount = 0;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    String[] words = line.split("\\s+");
                    totalWordCount += words.length;
                }
            }
            reader.close();
            wordCount = totalWordCount;
        } catch (IOException e) {
        }
        System.out.println("Word count: " + wordCount);
        scanner.close();
    }
}
/*
 * Написати додаток, який підраховує кількість слів у текстовому файлі.
 * Передбачається, що слова у файлі розділяються одним пропуском,
 * але на початку і в кінці речення може стояти будь-яку кількість пробілів.
 * Вивести назву файлу і кількість слів на екран.
 */
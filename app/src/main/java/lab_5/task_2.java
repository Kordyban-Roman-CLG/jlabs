package lab_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

public class task_2 {
    public static void main() {
        String inputFileName = "lab_5_2.txt";
        String outputFileName = "result.txt";

        LinkedList<String> lines = new LinkedList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            ListIterator<String> iterator = lines.listIterator(lines.size());
            while (iterator.hasPrevious()) {
                writer.write(iterator.previous());
                writer.newLine();
            }
        } catch (IOException e) {
        }
    }
}
/*
 * Ввести рядки з файлу, записати в список LinkedList.
 * Вивести рядки в файл у зворотному порядку.
 */
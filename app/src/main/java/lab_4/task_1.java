package lab_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task_1 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter input file name: ");
            String inputFileName = scanner.nextLine();
            System.out.print("Enter output file name: ");
            String outputFileName = scanner.nextLine();
            if (inputFileName == "") {
                inputFileName = "lab_4_1.txt";
            }
            if (outputFileName == "") {
                outputFileName = "result.txt";
            }
            String fileContent = new String(Files.readAllBytes(Paths.get(inputFileName)));
            String filteredContent = fileContent.replaceAll("[^a-z\n]", "");
            while (filteredContent.contains("\n\n")) {
                filteredContent = filteredContent.replace("\n\n", "\n");
            }
            String sortedContent = Arrays.stream(filteredContent.split("\n"))
                    .filter(line -> !line.isEmpty())
                    .sorted()
                    .collect(Collectors.joining("\n"));
            Files.write(Paths.get(outputFileName), sortedContent.getBytes());
            System.out.println("File processed successfully!");
        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
/*
 * З файлу, назва якого вводиться користувачем,
 * прочитати дані в один із стандартних контейнерів.
 * Обробити дані згідно варіанту завдання і записати результати у інший файл.
 * Зчитати рядки з файлу, вилучити усі порожні рядки (ті, які не містять
 * символів або складаються лише з пробілів).
 * Записати у файл, що задається користувачем з консолі,
 * зчитані рядки, попередньо вилучивши з усіх рядків символи,
 * які не є маленькими латинськими літерами, і відсортувати їх.
 */
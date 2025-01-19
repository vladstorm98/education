package practice.input_output_homework;

import java.io.*;
import java.util.Scanner;

public class OutputTask {
    public static void main(String[] args) throws IOException {
        /* Create a path to the needed file */
        File resource1Path = new File(System.getProperty("user.dir"), "resources\\file1.txt");
        File resource2Path = new File(System.getProperty("user.dir"), "resources\\file2.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(resource1Path))){
            writeNumbers(writer, 1, 6);
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(resource2Path, true))){
            writeEvenNumbers(writer, 1, 6);
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(resource1Path));
             Scanner scanner = new Scanner(reader)){
            readOddNumbers(scanner);
        }
    }


    public static void writeNumbers(BufferedWriter writer, int from, int to) throws IOException {
        for (int i = from; i < to; i++) {
            writer.write(String.valueOf(i));
            writer.newLine();
        }
    }

    public static void writeEvenNumbers(BufferedWriter writer, int from, int to) throws IOException {
        for (int i = from; i < to; i++) {
            if (i % 2 == 1) {
                writer.write(String.valueOf(i));
                writer.newLine();
            }
        }
    }

    public static void readOddNumbers(Scanner scanner) {
        StringBuilder result = new StringBuilder();
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                result.append(number).append("\n");
            }
        }
        System.out.println(result);

    }
}

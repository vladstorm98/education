package practice.input_output_homework;

import java.io.*;
import java.util.Scanner;

public class Task_2 {
    public static final String SPACE_SYMBOL = " ";

    public static void main(String[] args) throws IOException {
        File resourcePath = new File(System.getProperty("user.dir"), "\\resources\\my_first_file.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(resourcePath))) {
            String firstLine = "My grandma";
            String secondLine = "is reading the book";
            writer.write(firstLine);
            writer.newLine();
            writer.write(secondLine);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(resourcePath));
             Scanner scanner = new Scanner(reader)) {

            StringBuilder result = new StringBuilder();
            while (scanner.hasNext()) {
                result.append(scanner.nextLine()).append(SPACE_SYMBOL);
            }
            System.out.println(result);
        }

    }
}

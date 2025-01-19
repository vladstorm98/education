package practice.input_output_homework;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        File resourcePath = new File(System.getProperty("user.dir"), "\\resources\\article.txt");

        int countAllLines = getCountLines(resourcePath);
        Car[] cars = new Car[countAllLines];
        writeCarsToArray(resourcePath, cars);
        System.out.println(Arrays.toString(cars));


    }

    public static void writeCarsToArray(File resourcePath, Car[] cars) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(resourcePath));
             Scanner scanner = new Scanner(reader)){
            int countLines = 0;
            while (scanner.hasNext()) {
                String[] lineArray = scanner.nextLine().split(";");
                if (countLines == 0) {
                    countLines++;
                    continue;
                }
                double price = Double.parseDouble(lineArray[0]);
                String model = lineArray[1];
                double mileage = Double.parseDouble(lineArray[2]);

                Car car = new Car(price, model, mileage);
                cars[countLines-1] = car;

                countLines++;
            }
        }
    }

    public static int getCountLines(File resourcePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(resourcePath));
             Scanner scanner = new Scanner(reader)){
            int countLines = 0;
            while (scanner.hasNext()) {
                if (countLines == 0) {
                    countLines++;
                    scanner.nextLine();
                    continue;
                }
                scanner.nextLine();
                countLines++;
            }
            return countLines - 1;
        }
    }
}

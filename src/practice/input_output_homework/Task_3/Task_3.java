package practice.input_output_homework.Task_3;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

import static java.lang.String.*;

public class Task_3 {
    private static final String COMMA_SYMBOL = ", ";
    private static final String INCOMES_DESIGNATION = "incomes = ";
    private static final String OUTCOMES_DESIGNATION = "outcomes = ";

    public static void main(String[] args) throws IOException {
        int countRecords = 10;
        String[] records = createRecords(countRecords);
        FinancialRecord[] newRecords = generateRecords(countRecords);

        File resourcePath = new File(System.getProperty("user.dir"), "\\resources\\report.txt");
        File newResourcePath = new File(System.getProperty("user.dir"), "\\resources\\new_report.txt");

        writeRecordToFile(resourcePath, records);
        printReports(resourcePath, records);

//        writeRecordToFile(newResourcePath, newRecords);
//        printReports(newResourcePath, newRecords);
    }

    public static void writeRecordToFile(File resourcePath, String[] records) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(resourcePath))) {
            for (int i = 0; i < records.length; i++) {
                writer.write(records[i]);
                if (i != records.length - 1) {
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String[] createRecords(int countRecords) {
        String[] records = new String[countRecords];
        Random random = new Random();
        for (int i = 0; i < records.length; i++) {
            FinancialRecord financialRecord = new FinancialRecord(random.nextInt(10_000),
                                                                                random.nextInt(10_000));
            String record = valueOf(new StringBuilder()
                    .append(INCOMES_DESIGNATION)
                    .append(financialRecord.getIncome())
                    .append(COMMA_SYMBOL)
                    .append(OUTCOMES_DESIGNATION)
                    .append(financialRecord.getOutcome()));
            records[i] = record;
        }
        return records;
    }

    public static FinancialRecord[] generateRecords(int countRecords) {
        Random random = new Random();
        FinancialRecord[] newRecords = new FinancialRecord[countRecords];
        for (int i = 0; i < countRecords ; i++) {
            newRecords[i] = new FinancialRecord(random.nextInt(10_000), random.nextInt(10_000));
        }
        return newRecords;

    }

    public static void printReports(File resourcePath, String[] records) throws IOException {
        int incomes = 0;
        int outcomes = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(resourcePath));
             Scanner scanner = new Scanner(reader)) {
            scanner.useDelimiter("[^0-9]+");
            while (scanner.hasNext()) {
                incomes += scanner.nextInt();
                outcomes += scanner.nextInt();
            }
            System.out.println("Total incomes: " + incomes + ", total outcomes = " + outcomes + ".\n");
        }
    }
}

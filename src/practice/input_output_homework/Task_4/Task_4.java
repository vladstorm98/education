package practice.input_output_homework.Task_4;

import java.io.*;
import java.math.BigDecimal;
import java.util.HashMap;

import java.util.Scanner;

public class Task_4 {
    public static final String DELIMITER_SYMBOL = ";";
    private static final String SLASH_SYMBOL = "/";

    public static void main(String[] args) throws IOException {
        File resourcesPath = new File(System.getProperty("user.dir"), "resources/task_4");
        DataGenerator.createReports(resourcesPath);
        getProfitReportByShop("pyterochka", resourcesPath);
        // Задача №1
        // Необходимо составить отчет об итоговой прибыли за каждый месяц по магазину pyterochka
        // Формат ожидаемого результат:
        // Прибыль по магазину pyterochka по месяцам
        // 01.2012: 20000.00
        // 02.2012: -100332.00 и тд

    }

    public static void getProfitReportByShop(String shop, File resourcesPath) throws IOException {
        String[] list = resourcesPath.list();
        HashMap<String, BigDecimal[]> result = new HashMap<>();
        assert list != null;
        for (String file : list) {
            File filePath = new File(resourcesPath, file);
//            System.out.println("Обрабатываем файл: " + filePath.getAbsolutePath());
            getResultFromShop(filePath, true, result, shop);
        }
    }

    public static void getResultFromShop(File fileName,
                                         boolean isFirstRow,
                                         HashMap<String, BigDecimal[]> result,
                                         String shopName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String monthAndYearKey = "";
            BigDecimal incomePerMonth = BigDecimal.valueOf(0);
            BigDecimal outcomePerMonth = BigDecimal.valueOf(0);

            while (reader.ready()) {
                if (isFirstRow) {
                    reader.readLine();
                    isFirstRow = false;
                    continue;
                }
                String[] fields = reader.readLine().split(DELIMITER_SYMBOL);
                if (!shopName.equals(fields[0])) {
                    continue;
                }
                incomePerMonth = incomePerMonth.add(new BigDecimal(fields[1]));
                outcomePerMonth = outcomePerMonth.add(new BigDecimal(fields[2]));
                String[] date = fields[3].split(SLASH_SYMBOL);
                if (monthAndYearKey.isEmpty()) {
                    monthAndYearKey = String.format("%s.%s", date[1], date[2]);
                }
            }

            result.put(monthAndYearKey, new BigDecimal[]{incomePerMonth, outcomePerMonth});
            if (result.containsKey(monthAndYearKey)) {
                BigDecimal[] incomesAndOutcomesPerMonth = result.get(monthAndYearKey);
                System.out.println(monthAndYearKey + ": " + incomesAndOutcomesPerMonth[0]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

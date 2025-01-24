package practice.input_output_homework.Task_4;

import java.io.*;
import java.math.BigDecimal;
import java.util.HashMap;

public class Task_5 {
    public static final String DELIMITER_SYMBOL = ";";
    private static final String[] SHOPS = {"pyterochka", "perekrestok", "okey", "ydoma"};

    public static void main(String[] args) throws IOException {
        File resourcesPath = new File(System.getProperty("user.dir"), "resources/task_4");
        DataGenerator.createReports(resourcesPath);
        getOutcomesReportByAllShops(resourcesPath);
    }

    public static void getOutcomesReportByAllShops(File resourcesPath) {
        String[] list = resourcesPath.list();
        HashMap<String, BigDecimal> result = new HashMap<>();

        assert list != null;
        for (String file : list) {
            File filePath = new File(resourcesPath, file);
            HashMap<String, BigDecimal> resultPerMonth = new HashMap<>();
            for (String shop : SHOPS) {
                getResultFromShop(filePath, true, resultPerMonth, shop);
            }

            for (String shop : SHOPS) {
                BigDecimal outcomes = resultPerMonth.get(shop);
                if (result.containsKey(shop)){
                    result.put(shop, result.get(shop).add(outcomes));
                } else {
                    result.put(shop, outcomes);
                }
            }
        }

        for (String key : result.keySet()) {
            System.out.println("Outcomes \"" + key + "\" for year: " + result.get(key));
        }

    }

    public static void getResultFromShop(File fileName,
                                         boolean isFirstRow,
                                         HashMap<String, BigDecimal> resultPerMonth,
                                         String shop) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            BigDecimal outcomePerMonth = BigDecimal.valueOf(0);

            while (reader.ready()) {
                if (isFirstRow) {
                    reader.readLine();
                    isFirstRow = false;
                    continue;
                }
                String[] fields = reader.readLine().split(DELIMITER_SYMBOL);
                if (shop.equals(fields[0])) {
                    outcomePerMonth = outcomePerMonth.add(new BigDecimal(fields[2]));
                }
            }

            resultPerMonth.put(shop, outcomePerMonth);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package start.lesson2;

import java.util.HashSet;
import java.util.Map;
import java.util.regex.Pattern;

public class MyMap {
    public static void main(String[] args) {
        Map<Integer, Map<String, String[]>> data = Generator.getData();
        getSpecialNumbers(data);
    }

    public static void getSpecialNumbers(Map<Integer, Map<String, String[]>> data) {
        Pattern pattern = Pattern.compile("М\\d{3}АВ");
        HashSet<String> specialNumbers = new HashSet<>();
        for (Map.Entry<Integer, Map<String, String[]>> region : data.entrySet()) {
            for (Map.Entry<String, String[]> regionData : region.getValue().entrySet()) {
                for (String carNumber : regionData.getValue()) {
                    if (pattern.matcher(carNumber).find()) {
                        specialNumbers.add(carNumber);
                    }
                }

            }

        }
        System.out.println(specialNumbers.size());
    }
}

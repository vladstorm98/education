package tasks;

import java.util.Map;
import java.util.stream.Collectors;

public class AmountUniqSymbols {
    public static void main(String[] args) {
        // Подсчитать, сколько раз каждый символ встречается в строке.
        String text = "I am walking through the bridge";
        Map<String, Long> uniqCount = text.chars()
                .mapToObj(String::valueOf)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(uniqCount);
    }
}

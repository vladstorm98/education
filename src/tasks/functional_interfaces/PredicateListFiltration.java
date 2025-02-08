package tasks.functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateListFiltration {
    public static void main(String[] args) {
        // У тебя есть список чисел. Фильтруй только чётные, но не те, что делятся на 4. Используй Predicate<Integer>.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 6, 8, 10, 12, 15, 16);

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isNotDividesOnFour = n -> n % 4 != 0;

        // Solve with cycle
        List<Integer> result = new ArrayList<>();
        for (int n : numbers) {
            if (!isEven.and(isNotDividesOnFour).test(n)) continue;
            result.add(n);
        }

        // Solve with stream
        List<Integer> resultStream = numbers.stream()
                .filter(isEven.and(isNotDividesOnFour))
                .toList();

        System.out.println(result);
        System.out.println(resultStream); // [2, 6, 10]
    }
}

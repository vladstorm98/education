package functional_interfaces;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SupplierRandomStringGenerator {
    public static void main(String[] args) {
        // Сделай Supplier<String>, который генерирует случайные строки длиной 5 символов.
        Supplier<String> result = () -> IntStream.range(0, 5)
                .mapToObj(i -> String.valueOf((char) ('a' + new Random().nextInt(26))))
                .collect(Collectors.joining(""));

        System.out.println(result.get());
    }
}

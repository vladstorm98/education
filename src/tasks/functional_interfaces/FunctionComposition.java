package tasks.functional_interfaces;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionComposition {
    public static void main(String[] args) {
        // Сделай цепочку Function<T, R>, которая: Берёт число и умножает на 2. Добавляет 10.
        // Преобразует в строку "Результат: " + число.
        UnaryOperator<Integer> multiplyingOnTwo = i -> i * 2;
        UnaryOperator<Integer> addingTen = i -> i + 10;
        Function<Integer, String> convertingString = i -> "Result: " + i;

        String result = multiplyingOnTwo
                .andThen(addingTen)
                .andThen(convertingString)
                .apply(2);
        System.out.println(result);
    }
}

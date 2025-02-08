package tasks.functional_interfaces;

import java.util.function.UnaryOperator;

public class FunctionChain {
    public static void main(String[] args) {
        // Есть строка, нужно с помощью Function применить несколько преобразований: удалить пробелы,
        // преобразовать в верхний регистр, добавить восклицательный знак.
        String text = "My name is Georgy, I know English.";

        UnaryOperator<String> deleteSpace = str -> str.replace(" ", "");
        UnaryOperator<String> toUpperCase = String::toUpperCase;
        UnaryOperator<String> addExclamation = s -> s + "!";

        String result = deleteSpace
                .andThen(toUpperCase)
                .andThen(addExclamation)
                .apply(text);

        System.out.println(result);

    }
}

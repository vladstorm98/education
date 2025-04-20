package tasks.functional_interfaces;

import java.util.function.Consumer;

public class ConsumerDataLogger {
    public static void main(String[] args) {
        // Напиши Consumer<String>, который принимает строку, дописывает к ней LOG: и выводит в консоль.
        Consumer<String> result = s -> System.out.println("LOG: " + s);
        result.accept("Some text about logging");
    }
}

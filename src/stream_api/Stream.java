package stream_api;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Stream {
    public static void main(String[] args) {
//        List<String> products = List.of("apple", "milk", "cookie", "apple", "butter");
//
//        int count = 0;
//        for (String product : products) {
//            if (product.equals("apple")) {
//                count++;
//            }
//        }
//        System.out.println(count);
//
//        System.out.println(products.stream().filter(e -> e.equals("apple")).count());
//
//        Flyable airplane = () -> System.out.println("airplane flies");
//        airplane.fly();
//
//        Calc calc = (a, b) -> a + b;
//        int result = calc.add(1,2);
//        System.out.println(result);
//
//        Flyable airplane2 = () -> {
//            System.out.println("hi");
//            System.out.println("hi2");
//        };
//
//        Calc calc1 = (a, b) -> {
//            System.out.println("result " + (a + b));
//            return a + b;
//        };
//        calc1.add(1,3);
//
//        // Проверка на возраст
//        Predicate<Integer> isAdult = (age) -> age > 17;
//        boolean result3 = isAdult.test(20);
//        System.out.println(result3);
//
//        // Покупка в автомате напитка
//        Function<Integer, String> automate = (money) -> {
//            if (money == 100) {
//                return "Cola";
//            } else if (money == 50) {
//                return "Water";
//            } else {
//                return "Nothing";
//            }
//        };
//
//        System.out.println(automate.apply(100));
//
//        // Костер
//        Consumer<String> fire = item -> {
//            if (item.equals("drova")) {
//                System.out.println("gorit dolgo");
//            } else if (item.equals("bumaga")) {
//                System.out.println("gorit yarko");
//            }
//
//        };
//        fire.accept("drova");
//
//        // Талоны в очереди
//        Supplier<Integer> talon = () -> new Random().nextInt(100);
//        System.out.println(talon.get());

        long start = System.currentTimeMillis();
        Circle circle3 = new Circle("purple");
        Circle circle1 = new Circle("purple");
        Circle circle2 = new Circle("purple");

        List<Circle> circles = List.of(circle1, circle2, circle3);

        // Так было раньше
//        for (Circle circle : circles) {
//            circle.setColor("yellow");
//        }
//        circles.stream().forEach(circle -> circle.setColor("yellow"));
//        System.out.println(circles);
        // ==
        circles.parallelStream().forEach(circle -> circle.setColor("yellow"));
        System.out.println(circles);

        long end = System.currentTimeMillis();
        System.out.println( (end - start) / 1000);


    }
}

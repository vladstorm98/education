package tasks.stream_api.order_system;

import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        // Есть система заказов, где каждый заказ содержит информацию о клиенте, дате заказа и списке позиций заказа.
        // Каждая позиция заказа (OrderItem) включает название товара, количество и цену за единицу.
        // Необходимо решить следующие задачи с использованием Stream API (задания ниже):
        Customer ivan = new Customer(1, "Ivan");
        Customer svetlana = new Customer(2, "Svetlana");
        Customer nazar = new Customer(3, "Nazar");

        List<Order> orders = List.of(
                new Order(10, ivan, LocalDate.of(2025, Month.AUGUST, 1), List.of(
                        new OrderItem("Laptop", 1, 1200),
                        new OrderItem("Mouse", 2, 25)
                )),
                new Order(11, nazar, LocalDate.of(2025, Month.DECEMBER, 11), List.of(
                        new OrderItem("Keyboard", 1, 75),
                        new OrderItem("Monitor", 2, 300)
                )),
                new Order(13, svetlana, LocalDate.of(2025, Month.JANUARY, 16), List.of(
                        new OrderItem("Laptop", 1, 1150),
                        new OrderItem("Headphones", 1, 150)
                )),
                new Order(14, ivan, LocalDate.of(2025, Month.APRIL, 2), List.of(
                        new OrderItem("Mouse", 1, 20),
                        new OrderItem("Keyboard", 1, 70)
                )),
                new Order(15, svetlana, LocalDate.of(2025, Month.JANUARY, 6), List.of(
                        new OrderItem("Monitor", 1, 320),
                        new OrderItem("USB Cable", 3, 10)
                ))
        );

        // 1. Найти клиентов, у которых суммарная стоимость заказов превышает заданное значение.(Стоимость одного заказа
        // вычисляется как сумма (количество × цена) для всех позиций заказа.)
        double neededTotal = 1300;
        Map<Customer, Double> customerTotal = orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomer, Collectors.summingDouble(Order::getTotalAmount)));

        List<Customer> neededCustomers = customerTotal.entrySet().stream()
                .filter(e -> e.getValue() > neededTotal)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("Customers reached total threshold of 1300: " + neededCustomers);

        // 2. Сгруппировать заказы по месяцам и вычислить общую выручку за каждый месяц.
        Map<Month, Double> monthTotal = orders.stream()
                .collect(Collectors.groupingBy(
                        order -> order.getOrderDate().getMonth(),
                        Collectors.summingDouble(Order::getTotalAmount)));

        System.out.println("\nRevenue per month:");
        monthTotal.forEach((k, v) -> System.out.println(k + " - " + v + " coins."));

        // 3. Определить топ-3 самых популярных товара по количеству заказанных единиц.
        System.out.println("\nTop-3 popular goods:");
        orders.stream()
                .flatMap(order -> order.getOrderItems().stream())
                .sorted(Comparator.comparing(OrderItem::getQuantity, Comparator.reverseOrder()))
                .limit(3)
                .forEach(System.out::println);

        // 4. Вычислить для каждого клиента среднюю стоимость заказа.
        Map<Customer, Double> averageCustomersTotal = orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomer,
                        Collectors.averagingDouble(Order::getTotalAmount)));

        System.out.println("\nAverage receipt per client: ");
        averageCustomersTotal.forEach((k, v) -> System.out.println(k + " - " + v + " coins."));
    }
}

package tasks.stream_api.order_system;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

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

        OrderHandler handler = new OrderHandler(orders);

        handler.favoriteCustomers(1300);
        handler.revenueByMonth();
        handler.top3Items();
        handler.averageCustomerReceipt();
    }
}

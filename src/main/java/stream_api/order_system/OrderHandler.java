package stream_api.order_system;

import java.time.Month;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderHandler {
    private final List<Order> orders;

    public OrderHandler(List<Order> orders) {
        this.orders = orders;
    }

    public void favoriteCustomers(double threshold) {
        List<Customer> favoriteCustomers = getFavoriteCustomers(threshold);
        printFavoriteCustomers(threshold, favoriteCustomers);
    }

    private List<Customer> getFavoriteCustomers(double threshold) {
        Map<Customer, Double> customerTotal = getCustomerTotal();
        return customerTotal.entrySet().stream()
                .filter(e -> e.getValue() > threshold)
                .map(Map.Entry::getKey)
                .toList();
    }

    private Map<Customer, Double> getCustomerTotal () {
        return this.orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomer, Collectors.summingDouble(Order::getTotalAmount)));
    }

    private static void printFavoriteCustomers(double threshold, List<Customer> favoriteCustomers) {
        System.out.println("Favorite clients with receipt bigger than " + threshold + " coins:");
        favoriteCustomers.forEach(System.out::println);
    }

    public void revenueByMonth() {
        Map<Month, Double> revenueByMonth = getRevenueByMonth();
        printRevenueByMonth(revenueByMonth);
    }

    private Map<Month, Double> getRevenueByMonth () {
        return this.orders.stream()
                .collect(Collectors.groupingBy(
                        order -> order.getOrderDate().getMonth(),
                        Collectors.summingDouble(Order::getTotalAmount)));
    }

    private static void printRevenueByMonth(Map<Month, Double> map) {
        System.out.println("\nRevenue per month:");
        map.forEach((month, revenue) -> System.out.println(month + " - " + revenue + " coins."));
    }

    public void top3Items() {
        List<OrderItem> top3Items = getTop3Items();
        printTop3Items(top3Items);
    }

    private List<OrderItem> getTop3Items() {
        return this.orders.stream()
                .flatMap(order -> order.getOrderItems().stream())
                .sorted(Comparator.comparing(OrderItem::getQuantity, Comparator.reverseOrder()))
                .limit(3)
                .toList();
    }

    private static void printTop3Items(List<OrderItem> list) {
        System.out.println("\nTop-3 popular goods:");
        list.forEach(item -> System.out.println(item.getProduct() + " - x" + item.getQuantity() + "."));
    }

    public void averageCustomerReceipt() {
        Map<Customer, Double> averageCustomerReceipt = getAverageCustomerReceipt();
        printAverageCustomerReceipt(averageCustomerReceipt);
    }

    private Map<Customer, Double> getAverageCustomerReceipt() {
        return this.orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomer,
                        Collectors.averagingDouble(Order::getTotalAmount)));
    }

    private static void printAverageCustomerReceipt(Map<Customer, Double> map) {
        System.out.println("\nAverage receipt per client:");
        map.forEach((customer, receipt) -> System.out.println(customer + " - " + receipt + " coins."));
    }
}

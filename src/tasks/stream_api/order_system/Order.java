package tasks.stream_api.order_system;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private final int orderId;
    private final Customer customer;
    private final LocalDate orderDate;
    private final List<OrderItem> orderItems;

    public Order(int orderId, Customer customer, LocalDate orderDate, List<OrderItem> orderItems) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
        this.orderItems = orderItems;
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public double getTotalAmount() {
        return orderItems.stream()
                .mapToDouble(OrderItem::getTotalPrice)
                .sum();
    }

    @Override
    public String toString() {
        return "Order #" + orderId + " (" + orderDate + ") - " + customer;
    }
}

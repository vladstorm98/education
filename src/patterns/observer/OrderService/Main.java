package patterns.observer.OrderService;

public class Main {
    public static void main(String[] args) {
        var orderService = new OrderService();
        orderService.addObserver(new EmailService());
        orderService.addObserver(new AnalyticsService());
        orderService.addObserver(new WarehouseService());

        orderService.createOrder(1, "email.com");
    }
}

package patterns.observer.OrderService;

public class AnalyticsService implements Observer {
    @Override
    public void notifyAboutOrderCreation(Order order) {
        System.out.println("Order with id #" + order.id() + " has been created.");
    }
}

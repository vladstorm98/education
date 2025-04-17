package patterns.observer.OrderService;

public interface Observer {
    void notifyAboutOrderCreation(Order order);
}

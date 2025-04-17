package patterns.observer.OrderService;

public class WarehouseService implements Observer {
    @Override
    public void notifyAboutOrderCreation(Order order) {
        System.out.println("Prepare order with id #" + order.id());
    }
}

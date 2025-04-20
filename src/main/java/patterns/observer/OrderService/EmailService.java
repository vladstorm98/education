package patterns.observer.OrderService;

public class EmailService implements Observer {
    @Override
    public void notifyAboutOrderCreation(Order order) {
        System.out.println("Sending email to " + order.customerEmail() + " about order creation...");
    }
}

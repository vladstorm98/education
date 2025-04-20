package multithreading.SystemOfProcessingOrders;

public class OrderProcessor extends Thread{
    private Order order;

    public OrderProcessor(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        while (!order.isDelivered()) {
            order.nextStatus();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

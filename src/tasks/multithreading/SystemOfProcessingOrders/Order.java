package tasks.multithreading.SystemOfProcessingOrders;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Order {
    private final int id;
    private OrderStatus status;
    private final Lock lock = new ReentrantLock();

    public Order(int id) {
        this.id = id;
        this.status = OrderStatus.NEW;
    }

    public void nextStatus() {
        lock.lock();
        try {
            switch (status) {
                case NEW -> status = OrderStatus.PROCESSING;
                case PROCESSING -> status = OrderStatus.SHIPPED;
                case SHIPPED -> status = OrderStatus.DELIVERED;
            }
            System.out.printf("Order %d now %s%n", id, status);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public boolean isDelivered () {
        return status == OrderStatus.DELIVERED;
    }
}

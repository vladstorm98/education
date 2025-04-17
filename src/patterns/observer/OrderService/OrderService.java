package patterns.observer.OrderService;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void createOrder(int id, String customerEmail) {
        Order order = new Order(id, customerEmail);
        notifyObservers(order);
    }

    private void notifyObservers(Order order) {
        observers.forEach(observer -> observer.notifyAboutOrderCreation(order));
    }
}


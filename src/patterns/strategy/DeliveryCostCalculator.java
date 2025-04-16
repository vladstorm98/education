package patterns.strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class DeliveryCostCalculator {
    private DeliveryStrategy strategy;

    public void calculateCost(double distance) {
        double cost = strategy.calculatePrice(distance);
        System.out.println("Cost: " + cost);
    }
}

interface DeliveryStrategy {
    double calculatePrice(double distance);
}

class CourierDelivery implements DeliveryStrategy {
    @Override
    public double calculatePrice(double distance) {
        return 300 + 50 * distance;
    }
}

class SelfDelivery implements DeliveryStrategy {
    @Override
    public double calculatePrice(double distance) {
        return 0;
    }
}

class ExpressDelivery implements DeliveryStrategy {
    @Override
    public double calculatePrice(double distance) {
        return 1000;
    }
}

class Main {
    public static void main(String[] args) {
        var delivery = new DeliveryCostCalculator(new CourierDelivery());
        delivery.calculateCost(5.5);

        delivery.setStrategy(new SelfDelivery());
        delivery.calculateCost(7.5);

        delivery.setStrategy(new ExpressDelivery());
        delivery.calculateCost(8.5);
    }
}

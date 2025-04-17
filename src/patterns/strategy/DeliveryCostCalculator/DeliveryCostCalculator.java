package patterns.strategy.DeliveryCostCalculator;

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


package patterns.strategy.DeliveryCostCalculator;

public class SelfDelivery implements DeliveryStrategy {
    @Override
    public double calculatePrice(double distance) {
        return 0;
    }
}

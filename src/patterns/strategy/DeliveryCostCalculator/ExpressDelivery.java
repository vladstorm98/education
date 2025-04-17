package patterns.strategy.DeliveryCostCalculator;

public class ExpressDelivery implements DeliveryStrategy {
    @Override
    public double calculatePrice(double distance) {
        return 1000;
    }
}

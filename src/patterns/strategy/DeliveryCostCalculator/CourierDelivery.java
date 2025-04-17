package patterns.strategy.DeliveryCostCalculator;

public class CourierDelivery implements DeliveryStrategy {
    @Override
    public double calculatePrice(double distance) {
        return 300 + 50 * distance;
    }
}

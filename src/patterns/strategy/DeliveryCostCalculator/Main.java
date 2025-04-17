package patterns.strategy.DeliveryCostCalculator;

public class Main {
    public static void main(String[] args) {
        var delivery = new DeliveryCostCalculator(new CourierDelivery());
        delivery.calculateCost(5.5);

        delivery.setStrategy(new SelfDelivery());
        delivery.calculateCost(7.5);

        delivery.setStrategy(new ExpressDelivery());
        delivery.calculateCost(8.5);
    }
}

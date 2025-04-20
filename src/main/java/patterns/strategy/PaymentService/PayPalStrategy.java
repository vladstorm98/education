package patterns.strategy.PaymentService;

public class PayPalStrategy implements PaymentStrategy {
    @Override
    public String pay(int amount) {
        return "Payment of " + amount + " by PayPal";
    }
}

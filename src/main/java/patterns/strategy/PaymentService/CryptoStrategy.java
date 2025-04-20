package patterns.strategy.PaymentService;

public class CryptoStrategy implements PaymentStrategy {
    @Override
    public String pay(int amount) {
        return "Payment of " + amount + " by crypto";
    }
}

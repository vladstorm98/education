package patterns.strategy.PaymentService;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public String pay(int amount) {
        return "Payment of " + amount + " by credit card";
    }
}

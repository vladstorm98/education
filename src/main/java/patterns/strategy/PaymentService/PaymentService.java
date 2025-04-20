package patterns.strategy.PaymentService;
 
 import lombok.AllArgsConstructor;
 import lombok.NoArgsConstructor;
 import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentService {
    private PaymentStrategy strategy;

    public String pay(int amount) {
        return strategy.pay(amount);
    }
}

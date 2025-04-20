package patterns.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import patterns.strategy.PaymentService.CreditCardStrategy;
import patterns.strategy.PaymentService.CryptoStrategy;
import patterns.strategy.PaymentService.PayPalStrategy;
import patterns.strategy.PaymentService.PaymentService;

import static org.assertj.core.api.Assertions.assertThat;

public class PaymentServiceTest {

    private static final int AMOUNT = 100;

    private PaymentService service;

    @BeforeEach
    public void setUp() {
        service = new PaymentService();
    }

    @Test
    public void shouldPayWithCreditCard() {
        service.setStrategy(new CreditCardStrategy());

        String result = service.pay(AMOUNT);

        assertThat(result).isEqualTo("Payment of " + AMOUNT + " by credit card");
    }

    @Test
    public void shouldPayWithCrypto() {
        service.setStrategy(new CryptoStrategy());

        String result = service.pay(AMOUNT);

        assertThat(result).isEqualTo("Payment of " + AMOUNT + " by crypto");
    }

    @Test
    public void shouldPayWithPayPal() {
        service.setStrategy(new PayPalStrategy());

        String result = service.pay(AMOUNT);

        assertThat(result).isEqualTo("Payment of " + AMOUNT + " by PayPal");
    }
}

package patterns.strategy.TaxCalculator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TaxCalculator {
    private final Country country;

    public double calculateTax(double income) {
        return country.applyTax(income);
    }
}


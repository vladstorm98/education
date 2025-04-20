package patterns.strategy.TaxCalculator;

public class GermanyTax implements TaxStrategy {
    @Override
    public double calculateTax(double income) {
        return income * 0.25;
    }
}

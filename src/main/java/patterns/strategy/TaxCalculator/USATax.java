package patterns.strategy.TaxCalculator;

public class USATax implements TaxStrategy {
    @Override
    public double calculateTax(double income) {
        return income * 0.3;
    }
}

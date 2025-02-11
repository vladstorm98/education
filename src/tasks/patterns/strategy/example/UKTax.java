package tasks.patterns.strategy.example;

public class UKTax implements TaxStrategy {
    @Override
    public double calculateTax(double income) {
        return income * 0.2;
    }
}

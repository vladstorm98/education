package tasks.patterns.strategy.example;

public class TaxCalculator {
    private static double calculateTax(Countries country, double income) {
        return country.applyTax(income);
    }
}



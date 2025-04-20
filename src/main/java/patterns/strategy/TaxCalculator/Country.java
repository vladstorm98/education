package patterns.strategy.TaxCalculator;

public enum Country {
    USA (new USATax()),
    GERMANY (new GermanyTax()),
    UK (new UKTax());

    private final TaxStrategy strategy;

    Country(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    public double applyTax(double income) {
        return strategy.calculateTax(income);
    }
}

package tasks.patterns.strategy.example;

public enum Countries {
    USA (new USATax()),
    GERMANY (new GermanyTax()),
    UK (new UKTax());

    private final TaxStrategy strategy;

    Countries(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    public double applyTax(double income) {
        return strategy.calculateTax(income);
    }
}


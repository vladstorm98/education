package patterns.strategy.TaxCalculator;

public class Main {
    public static void main(String[] args) {
        var germanyCalculator = new TaxCalculator(Country.GERMANY);
        var usaTaxCalculator = new TaxCalculator(Country.USA);
        var ukTaxCalculator = new TaxCalculator(Country.UK);

        System.out.println("Germany tax: $" + germanyCalculator.calculateTax(100.50));
        System.out.println("USA tax: $" + usaTaxCalculator.calculateTax(150.75));
        System.out.println("UK tax: $" + ukTaxCalculator.calculateTax(200.25));
    }
}

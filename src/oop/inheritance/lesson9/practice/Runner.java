package oop.inheritance.lesson9.practice;

public class Runner {
    public static void main(String[] args) {
        Security security = new Security(true);
        Secretary secretary = new Secretary(false);
        Accountant accountant = new Accountant(false);

        security.getPaid();
        secretary.drinkCoffee();
        accountant.getPaid();
    }
}

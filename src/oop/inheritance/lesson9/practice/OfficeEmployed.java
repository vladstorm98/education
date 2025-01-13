package oop.inheritance.lesson9.practice;

public abstract class OfficeEmployed extends Human {
    public OfficeEmployed(boolean isMan) {
        super(isMan);
    }

    public void drinkCoffee() {
        System.out.println("Office worker drinks coffee");
    }
}

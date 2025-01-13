package oop.inheritance.lesson9.practice;

public class Security extends Human {
    public Security(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getPaid() {
        System.out.println("Security got 15 000");
    }
}

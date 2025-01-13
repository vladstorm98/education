package oop.inheritance.lesson9.practice;

public class Accountant extends OfficeEmployed {
    public Accountant(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getPaid() {
        System.out.println("Accountant got 50 000");
    }
}

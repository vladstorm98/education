package oop.inheritance.lesson9.practice;

public class Secretary extends OfficeEmployed {
    public Secretary(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getPaid() {
        System.out.println("Secretary got 30 000");
    }
}

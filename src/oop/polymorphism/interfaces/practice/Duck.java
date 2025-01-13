package oop.polymorphism.interfaces.practice;

public class Duck implements Flyable, Swimable {
    @Override
    public void fly() {
        System.out.println("Duck fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck swim");
    }
}

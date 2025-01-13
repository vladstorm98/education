package oop.polymorphism.interfaces.basics;

public class Car implements Moveable{
    public void move() {
        System.out.println("Car moves");
    }

    public void turnOff() {
        System.out.println("Car doesn't work");
    }
}

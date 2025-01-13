package oop.polymorphism.interfaces.interface_inheritance;

public interface Moveable {
    void move();
    default void eat() {
        System.out.println("Moves and Eats");
    }
}

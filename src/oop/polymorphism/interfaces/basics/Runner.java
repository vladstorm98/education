package oop.polymorphism.interfaces.basics;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();
        car.move();
        dog.move();

        Moveable[] moveables = new Moveable[2];
        moveables[0] = car;
        moveables[1] = dog;

        for (Moveable moveable : moveables) {
            moveable.move();
        }

    }
}

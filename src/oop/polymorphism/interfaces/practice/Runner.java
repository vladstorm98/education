package oop.polymorphism.interfaces.practice;

public class Runner {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Duck duck = new Duck();
        Plane plane = new Plane();
        Swimable[] swimpool = {fish, duck};
        Flyable[] sky = {duck, plane};
        for (Swimable swimable : swimpool) {
            swimable.swim();
        }
        for (Flyable flyable : sky) {
            flyable.fly();

        }


    }
}

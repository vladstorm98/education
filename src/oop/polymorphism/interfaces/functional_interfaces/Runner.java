package oop.polymorphism.interfaces.functional_interfaces;

public class Runner {
    public static void main(String[] args) {
        Sounding cat = new Cat();
        cat.makeSound();

        Sounding bird = () -> System.out.println("Bird sings");
        bird.makeSound();
    }
}

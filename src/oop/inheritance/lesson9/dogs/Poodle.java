package oop.inheritance.lesson9.dogs;

public class Poodle extends Dog {
    public Poodle() {
        super(28);
    }

    public void run() {
        System.out.println("Dog is running slow");
    }

    @Override
    public void breath() {
        System.out.println("Poodle breathes");
    }
}

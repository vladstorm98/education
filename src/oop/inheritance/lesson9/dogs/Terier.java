package oop.inheritance.lesson9.dogs;

public class Terier extends Dog {
    public Terier() {
        super(27);
    }

    @Override
    public void run() {
        System.out.println("Terier is running");
    }

    @Override
    public void breath() {
        System.out.println("Terier breathes");
    }
}

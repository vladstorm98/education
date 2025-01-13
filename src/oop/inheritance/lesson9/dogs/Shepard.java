package oop.inheritance.lesson9.dogs;

public final class Shepard extends Dog {
    public Shepard() {
        super(32);
    }

    @Override
    public void run() {
        System.out.println("Dog is running fast");
    }

    @Override
    public void breath() {
        System.out.println("Shepard breathes");
    }

    public void beAngry() {
        System.out.println("Shepard seen man");
        super.beAngry();
        System.out.println("Shepard hi");
    }
}

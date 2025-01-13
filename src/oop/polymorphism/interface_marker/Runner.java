package oop.polymorphism.interface_marker;

public class Runner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();

        if (airplane instanceof Alive) {
            System.out.println("Object is alive");
        } else {
            System.out.println("Object is not alive");
        }
    }
}

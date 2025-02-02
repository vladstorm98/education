package tasks.from_02_02_2025.inheritance_and_interface_exersice;

public class Bird implements Flyable, Movable{

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void move() {
        System.out.println("Bird is moving");
    }
}

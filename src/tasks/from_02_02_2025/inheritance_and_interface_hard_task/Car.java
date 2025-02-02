package tasks.from_02_02_2025.inheritance_and_interface_hard_task;

public class Car extends Vehicle implements Refuelable {
    private int fuel;

    public Car(String model, int speed) {
        super(model, speed);
    }

    @Override
    void move() {
        System.out.println("Car " + super.getModel() + " is moving at " + super.getSpeed() + " km/h.");
    }

    @Override
    void showInfo() {
        super.showInfo();
    }

    @Override
    public void refuel() {
        System.out.println("Car is charging.");
    }
}

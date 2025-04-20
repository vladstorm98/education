package tasks.from_02_02_2025.inheritance_and_interface_hard_task;

public class ElectricScooter extends Vehicle implements Refuelable {
    private int battery;

    public ElectricScooter(String model, int speed, int battery) {
        super(model, speed);
        this.battery = battery;
    }

    @Override
    void move() {
        System.out.println("Electric scooter " + super.getModel() + " is moving at " + super.getSpeed() + " km/h.");
    }

    @Override
    void showInfo() {
        super.showInfo();
    }

    @Override
    public void refuel() {
        System.out.println("Electric scooter charging...");
    }
}

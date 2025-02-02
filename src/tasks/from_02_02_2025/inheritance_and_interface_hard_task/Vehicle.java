package tasks.from_02_02_2025.inheritance_and_interface_hard_task;

public abstract class Vehicle {
    private String model;
    private int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    abstract void move();

    void showInfo() {
        System.out.println("Model: " + this.model);
        System.out.println("Speed: " + this.speed);
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }
}

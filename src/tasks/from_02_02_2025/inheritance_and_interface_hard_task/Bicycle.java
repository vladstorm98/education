package tasks.from_02_02_2025.inheritance_and_interface_hard_task;

public class Bicycle extends Vehicle{
    private boolean hasBell;

    public Bicycle(String model, int speed, boolean hasBell) {
        super(model, speed);
        this.hasBell = hasBell;
    }

    @Override
    void move() {
        String hasBell = this.hasBell ? "Yes" : "No";
        System.out.println("Bicycle " + super.getModel() + " is moving. Ring bell: " + hasBell + ".");
    }

    @Override
    void showInfo() {
        super.showInfo();
    }
}

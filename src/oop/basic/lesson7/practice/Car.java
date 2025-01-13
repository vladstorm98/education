package oop.basic.lesson7.practice;

public class Car {
    private String brand;
    private int maxSpeed = 220;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void investigateSpeed100() {
        double value = 110d / (this.maxSpeed / 20d);
        System.out.printf("Скорость разгона до 100 км/ч: %f сек.\n", value);
    }

    public String getBrand() {
        return brand;
    }
}

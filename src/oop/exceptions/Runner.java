package oop.exceptions;

public class Runner {
    public static void main(String[] args) {
        try {
            Car car = new Car(true);
            car.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

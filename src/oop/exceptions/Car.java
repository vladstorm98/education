package oop.exceptions;

public class Car {
    private boolean isBroken;

    public Car(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public void start() throws CarIsBrokenException {
        if (isBroken) {
            throw new CarIsBrokenException("Car doesn't work!");
        }
        System.out.println("Car started");
    }
}

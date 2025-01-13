package oop.exceptions;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            launchCar(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }

    }

    public static void launchCar(int fuel) throws Exception {
        checkFuel(fuel);
        System.out.println("car goes");

    }

    public static void checkFuel(int fuel) throws Exception {
        if (fuel  <= 0) {
            throw new Exception("no fuel");

        }
    }
}

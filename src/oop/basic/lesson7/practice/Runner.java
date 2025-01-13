package oop.basic.lesson7.practice;

public class Runner {
    public static void main(String[] args) {
        Car mazda = new Car("Mazda");
        Car lexus = new Car("Lexus", 400);

        Garage garage = new Garage();
        garage.setCar1(mazda);
        garage.setCar2(lexus);
        garage.getInfoAboutCars();
    }
}

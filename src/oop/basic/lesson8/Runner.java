package oop.basic.lesson8;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Car mazda = new Car("Mazda");
        Car audi = new Car("Audi");
        System.out.println(audi.getCountCars());

        Car.printBrands();
        System.out.println(Car.BMW_INFO);

        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTIONS));

        Car.BRAND_DESCRIPTIONS[0] = "new info";
        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTIONS));

    }
}

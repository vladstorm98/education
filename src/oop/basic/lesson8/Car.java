package oop.basic.lesson8;

import java.util.Arrays;

public class Car {
    private String brand;
    private static int countCars = 0;
    public final static String BMW_INFO = "About BMW company";
    public final static String AUDI_INFO = "About Audi company";
    public final static String KIA_INFO = "About Kia company";

    public final static String[] BRAND_DESCRIPTIONS = new String[3];

    static {
        BRAND_DESCRIPTIONS [0] = BMW_INFO;
        BRAND_DESCRIPTIONS [1] = AUDI_INFO;
        BRAND_DESCRIPTIONS [2] = KIA_INFO;
        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTIONS));
    }

    public Car(String brand) {
        this.brand = brand;
        countCars++;
    }

    public int getCountCars() {
        return countCars;
    }

    public static void printBrands() {
        System.out.println("Бренды");
    }
}

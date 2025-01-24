package stream_api.stream.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Car audi = new Car("Audi");
        Car bmw = new Car("Bmw");

        Car[] garage = new Car[2];
        garage[0] = audi;
        garage[1] = bmw;

        garage[0] = null;

        Optional<Car> carOptional = Optional.ofNullable(garage[0]);

        System.out.println(Arrays.toString(garage));
        printBrandOfCar(audi);

//        CarOptional carOptional = CarOptional.ofNullable(garage[0]);
        System.out.println(carOptional.orElse(new Car("Lada")));
    }

    public static void printBrandOfCar(Car car) {
        System.out.println(car.getBrand());
    }
}

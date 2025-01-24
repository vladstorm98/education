package stream_api.stream.optional;

public class Car {

    private final String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String
    toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}

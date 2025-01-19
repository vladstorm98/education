package practice.input_output_homework;

public class Car {
    private double price;
    private String model;
    private double millage;

    public Car(double price, String model, double millage) {
        this.price = price;
        this.model = model;
        this.millage = millage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", millage=" + millage +
                '}';
    }
}

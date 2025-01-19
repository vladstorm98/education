package practice.exception_homework_3;

public class Car implements Sell{
    private double price;

    public Car(double price) {
        this.price = price;
    }

    public void getPrice() {
        if (this.price < 0) {
            throw new PriceException("Price cannot be less than 0");
        }
        System.out.println(this.price);
    }
}

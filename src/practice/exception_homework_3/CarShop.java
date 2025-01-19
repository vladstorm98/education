package practice.exception_homework_3;

public class CarShop implements Sell{
    private Car car;

    public CarShop(Car car) {
        this.car = car;
    }

    public void getPrice() {
        System.out.print("Hello client, price for this car - ");
        try {
            car.getPrice();
            System.out.println("Do you want to buy it?");
        } catch (PriceException e) {
            System.out.println("Unknown.\n" + e.getMessage() + "\nDo you want to see another?");
        }
    }

}

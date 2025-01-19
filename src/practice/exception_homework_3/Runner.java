package practice.exception_homework_3;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car(1000.50);
        CarShop carShop = new CarShop(car);
        carShop.getPrice();

        Car car1 = new Car(-9.50);
        CarShop carShop1 = new CarShop(car1);
        carShop1.getPrice();
    }
}

package tasks.from_02_02_2025.inheritance_and_interface_hard_task;

public class TransportManager {
    public static void main(String[] args) {
        // Разработай систему для управления различными видами транспорта.
        // Необходимо использовать наследование, абстрактные классы, интерфейсы и полиморфизм.
        // 1. Абстрактный класс Vehicle с полями: String model, int speed и методами: abstract void move() —
        // абстрактный метод для движения, void showInfo() — вывод информации о модели и скорости.
        // 2. Интерфейс Refuelable. Методы: void refuel() — заправить транспорт.
        // 3. Классы-наследники: Car- доп. поле: int fuelLevel, реализует Refuelable, переопределяет move().
        // Bicycle - доп. поле: boolean hasBell, не заправляется, переопределяет move(). ElectricScooter - доп. поле:
        // int batteryLevel, реализует Refuelable (зарядка вместо заправки), переопределяет move() и refuel()
        // 4. Класс TransportManager: Метод static void startJourney(Vehicle vehicle), должен запускать move() для
        // любого транспортного средства. Если транспорт заправляемый (Refuelable), проверить и заправить.
        Car tesla = new Car("Tesla", 120);
        Bicycle comanche = new Bicycle("Comanche", 40, true);
        ElectricScooter linux = new ElectricScooter("Linux", 60, 78);

        tesla.refuel();       // Car is charging.
        tesla.move();         // Car Tesla is moving at 120 km/h.
        tesla.showInfo();     // Model: Tesla. Speed: 120

        comanche.move();      // Bicycle Comanche is moving. Ring bell: Yes.
        comanche.showInfo();  // Model: Comanche. Speed: 40

        linux.move();         // Electric scooter Linux is moving at 60 km/h.
        linux.refuel();       // Electric scooter charging...
        linux.showInfo();     // Model: Linux. Speed: 60

    }

    static void startJourney(Vehicle vehicle) {

    }
}

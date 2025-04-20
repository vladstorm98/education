package tasks.from_02_02_2025.inheritance_and_interface_easy_exercise;

public class Runner {
    public static void main(String[] args) {
        // Создайте интерфейсы Movable и Flyable. Интерфейс Movable должен содержать метод move(), а Flyable —
        // метод fly(). Создайте класс Bird, который реализует оба интерфейса и реализует методы move() и fly().
        Bird bird = new Bird();

        bird.fly(); // Bird is flying
        bird.move(); // Bird is moving
    }
}

package multithreading.TrafficLightSimulator;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        // Симулируйте работу светофора, который переключает сигналы в определенной последовательности.
        // Создайте класс TrafficLightSimulator, который работает в отдельном потоке и меняет состояние светофора:
        // RED → 5 секунд, GREEN → 4 секунд, YELLOW → 2 секунды
        // В основном потоке выводите текущее состояние светофора каждые 500 мс.
        // Усложнение: Добавьте возможность остановить симулятор с помощью метода stop().
        TrafficLightSimulator simulator = new TrafficLightSimulator();
        simulator.start();

        new Thread(() -> {
            while (simulator.isRunning()) {
                System.out.println("now: " + simulator.getCurrentLight());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        Thread.sleep(20000);
        simulator.stopTrafficLight();
    }
}


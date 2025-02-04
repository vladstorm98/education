package tasks.multitreading.TrafficLightSimulator;

public class TrafficLightSimulator extends Thread{
    private boolean running = true;
    private TrafficLight currentLight = TrafficLight.GREEN;



    public void switchLight() {
        currentLight = switch (currentLight) {
            case GREEN -> currentLight = TrafficLight.RED;
            case RED -> currentLight = TrafficLight.YELLOW;
            case YELLOW -> currentLight = TrafficLight.GREEN;
        };
    }

    public void stopTrafficLight() {
        System.out.println("Traffic light switched off");
        running = false;
    }

    public boolean isRunning() {
        return running;
    }

    public TrafficLight getCurrentLight() {
        return currentLight;
    }
}

package practice.exception_homework;

public class Plane implements Flyable {
    private int countPassengers = 0;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException{
        if (countPassengers <= 0) {
            throw new FlyException("No passengers");
        }
        System.out.println("Plane flies");
    }


}

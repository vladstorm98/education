package stream_api.stream.optional;

public class CarOptional {
    private Car value;

    private CarOptional(Car value) {
        this.value = value;
    }

    public static CarOptional of(Car value) {
        if (value == null)
            throw new RuntimeException("Car has null value!");
        return new CarOptional(value);
    }

    public Car get() {
        return this.value;
    }

    public static CarOptional ofNullable(Car value) {
        return new CarOptional(value);
    }

    public Car orElse(Car carDefault) {
        return value == null ? carDefault : value;
    }
}

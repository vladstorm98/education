package stream_api;

public class Circle {
    private String color;

    public void setColor(String color) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.color = color;
    }

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                '}';
    }
}

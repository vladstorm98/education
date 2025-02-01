package tasks.from_01_02_2025;

public class Figures_1 {
    public static void main(String[] args) {
        // Создайте абстрактный класс Shape, который имеет абстрактный метод area(), который должен возвращать
        // площадь фигуры. Создайте два класса: Circle и Rectangle, которые наследуют Shape и реализуют метод area()
        // для вычисления площади круга и прямоугольника соответственно.
        Circle circle = new Circle(13.4);
        Rectangle rectangle = new Rectangle(20, 15.7);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
    }
}

abstract class Shape {
    abstract double area();
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14 * this.radius * this.radius;
    }
}

class Rectangle extends Shape{
    private double longSide;
    private double shortSide;

    public Rectangle(double longSide, double shortSide) {
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    double area() {
        return this.longSide * this.shortSide;
    }
}
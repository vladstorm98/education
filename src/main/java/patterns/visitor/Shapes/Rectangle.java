package patterns.visitor.Shapes;

public record Rectangle (double length, double width) implements Shape {
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

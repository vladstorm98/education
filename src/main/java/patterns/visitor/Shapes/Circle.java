package patterns.visitor.Shapes;

public record Circle (double radius) implements Shape {
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

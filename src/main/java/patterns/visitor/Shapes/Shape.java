package patterns.visitor.Shapes;

public interface Shape {
    void accept(ShapeVisitor visitor);
}

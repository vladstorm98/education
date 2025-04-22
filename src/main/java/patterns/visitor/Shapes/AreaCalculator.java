package patterns.visitor.Shapes;

public class AreaCalculator implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        var area = Math.PI * circle.radius() * circle.radius();
        System.out.println("Circle area = " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        var area = rectangle.length() * rectangle.width();
        System.out.println("Rectangle area = " + area);
    }
}

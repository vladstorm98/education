package patterns.visitor.Shapes;

public class ShapeDrawer implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Drawing Circle with radius = " + circle.radius());
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Drawing Rectangle with sides: " + rectangle.width() + " and " + rectangle.length());
    }
}

package patterns.visitor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import patterns.visitor.Shapes.AreaCalculator;
import patterns.visitor.Shapes.Circle;
import patterns.visitor.Shapes.Rectangle;
import patterns.visitor.Shapes.ShapeDrawer;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class ShapeTest {

    private Circle circle;
    private Rectangle rectangle;
    private ByteArrayOutputStream out;

    @BeforeEach
    void setUp() {
        circle = new Circle(3);
        rectangle = new Rectangle(4, 5);

        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    @DisplayName("""
            AreaCalculatorTest
                GIVEN The shapes with parameters
                WHEN Calculate area of the shapes
                THEN Correct area should be printed
            """)
    void testAreaCalculation() {
        // GIVEN
        var visitor = new AreaCalculator();

        // WHEN
        circle.accept(visitor);
        rectangle.accept(visitor);

        //THEN
        assertThat(out.toString())
                .contains("Circle area = " + Math.PI * circle.radius() * circle.radius())
                .contains("Rectangle area = " + rectangle.length() * rectangle.width());
    }

    @Test
    @DisplayName("""
            ShapeDrawerTest
                GIVEN The shapes with parameters
                WHEN Draw this shapes
                THEN Information about drawing should be printed
            """)
    void testShapeDrawer() {
        // GIVEN
        var visitor = new ShapeDrawer();

        // WHEN
        circle.accept(visitor);
        rectangle.accept(visitor);

        //THEN
        assertThat(out.toString())
                .contains("Drawing Circle with radius = " + circle.radius())
                .contains("Drawing Rectangle with sides: " + rectangle.width() + " and " + rectangle.length());
    }
}

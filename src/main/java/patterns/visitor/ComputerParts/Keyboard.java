package patterns.visitor.ComputerParts;

public class Keyboard implements ComputerPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

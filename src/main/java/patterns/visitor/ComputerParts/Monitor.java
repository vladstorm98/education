package patterns.visitor.ComputerParts;

public class Monitor implements ComputerPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

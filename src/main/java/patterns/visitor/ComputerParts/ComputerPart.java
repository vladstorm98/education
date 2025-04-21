package patterns.visitor.ComputerParts;

public interface ComputerPart {
    void accept(Visitor visitor);
}

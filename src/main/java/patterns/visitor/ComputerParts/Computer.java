package patterns.visitor.ComputerParts;

import java.util.Arrays;

public class Computer implements ComputerPart {
    private final ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(Visitor visitor) {
        Arrays.stream(parts).forEach(part -> part.accept(visitor));

        visitor.visit(this);
    }
}

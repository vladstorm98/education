package patterns.visitor.ComputerParts;

public class ComputerSystem implements Visitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Computer: " + computer.toString());
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse: " + mouse.toString());
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard: " + keyboard.toString());
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitor: " + monitor.toString());
    }
}

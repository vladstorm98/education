package patterns.visitor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import patterns.visitor.ComputerParts.Computer;
import patterns.visitor.ComputerParts.Keyboard;
import patterns.visitor.ComputerParts.Monitor;
import patterns.visitor.ComputerParts.Mouse;
import patterns.visitor.ComputerParts.Visitor;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.any;

@ExtendWith(MockitoExtension.class)
public class ComputerPartTest {

    @Mock
    private Visitor visitor;

    @Test
    void testMouseAccept() {
        Mouse mouse = new Mouse();
        mouse.accept(visitor);

        verify(visitor, times(1)).visit(mouse);
    }

    @Test
    void testKeyboardAccept() {
        Keyboard keyboard = new Keyboard();
        keyboard.accept(visitor);

        verify(visitor, times(1)).visit(keyboard);
    }

    @Test
    void testMonitorAccept() {
        Monitor monitor = new Monitor();
        monitor.accept(visitor);

        verify(visitor, times(1)).visit(monitor);
    }

    @Test
    void testComputerWithAllPartsAccept() {
        Computer computer = new Computer();
        computer.accept(visitor);

        verify(visitor, times(1)).visit(any(Mouse.class));
        verify(visitor, times(1)).visit(any(Keyboard.class));
        verify(visitor, times(1)).visit(any(Monitor.class));
        verify(visitor, times(1)).visit(computer);
    }
}

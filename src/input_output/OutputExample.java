package input_output;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OutputExample {
    public static void main(String[] args) {
        PrintStream consoleOut = System.out;

        ByteArrayOutputStream data = new ByteArrayOutputStream();
        System.setOut(new PrintStream(data));
        System.out.println("Typing text");

        System.setOut(consoleOut);
        System.out.println(String.valueOf(data).toUpperCase());
    }
}

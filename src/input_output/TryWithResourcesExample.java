package input_output;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;

public class TryWithResourcesExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("C:\\Java\\java_core\\resources\\article.txt");
            throw new RuntimeException("error!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("block finally");
            fileReader.close();
        }

        try (FileReader fileReader1 = new FileReader("C:\\Java\\java_core\\resources\\article.txt")) {
            throw new RemoteException("Error!!!");
        } catch (Exception e) {
            System.out.println("No Error!");
        }

    }
}

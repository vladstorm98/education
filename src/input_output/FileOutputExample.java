package input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) throws IOException {
        String menu1 = "Bread - 40 dollars\n";
        String fileName = "C:\\Java\\java_core\\menu.txt";
        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            outputStream.write(menu1.getBytes());
        }

        String menu2 = "Banana - 60 dollars\n";

        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.write(menu2);
        }
    }
}

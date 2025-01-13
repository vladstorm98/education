package input_output;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInputExample {
    public static void main(String[] args) throws IOException {

        InputStream resource = FileInputExample.class.getClassLoader().getResourceAsStream("article.txt");

//        String fileName = "C:\\Java\\java_core\\article.txt";
//        FileReader fileReader = new FileReader("path to file", StandardCharsets.UTF_8);
//        StringBuilder stringBuilder = new StringBuilder();
//        while (fileReader.ready()) {
//            stringBuilder.append((char) fileReader.read());
//        }
//        System.out.println(stringBuilder);
//        fileReader.close();


        Scanner scanner = new Scanner(resource, StandardCharsets.UTF_8);
        int count = 0;
        int lineNeeded = 1;
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            if (count == lineNeeded) {
                System.out.println(nextLine);
            }
            count++;
        }
        scanner.close();
        resource.close();
    }
}

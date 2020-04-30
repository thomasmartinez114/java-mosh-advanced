package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
            System.out.println("File opened");
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist");
        }
    }
}

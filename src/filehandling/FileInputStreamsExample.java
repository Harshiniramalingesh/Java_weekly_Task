package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamsExample {
    public static void main(String[] args) {

        try (FileInputStream input = new FileInputStream("Harshiniramalingesh.txt")) {
            int i;
            while ((i = input.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}

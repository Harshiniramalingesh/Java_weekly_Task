package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputStreams {
    public static void main(String[] args) {
        String text = "Hello World!";
        try (FileOutputStream output = new FileOutputStream("Harshiniramalingesh.txt")) {
            output.write(text.getBytes());
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    }
}

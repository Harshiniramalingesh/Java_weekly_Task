package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        try (FileWriter myWriter = new FileWriter("Harshini.txt", true)) {
            myWriter.write("Today I have  a review and this is Appended text!!!!");
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

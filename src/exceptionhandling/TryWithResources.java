package exceptionhandling;
import java.io.*;
public class TryWithResources {
    public static void main(String[] args){
        try(FileOutputStream output = new FileOutputStream("filename.txt")){
              output.write("Hello".getBytes());
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}

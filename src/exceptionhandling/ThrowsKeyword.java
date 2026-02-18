package exceptionhandling;
import java.io.*;
public class ThrowsKeyword {
    public static void readFile() throws IOException{
        FileReader fir = new FileReader("test.txt");
    }
    public static void main(String[] args){
        try{
            readFile();
        }
        catch(IOException e){
            System.out.println("Exception handled in main");
        }
    }
}

package exceptionhandling;

import java.io.*;
class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
public class CustomExceptionHandling{
    static void readData() {
        try {
            FileReader fr = new FileReader("test.txt");
            fr.read();
            fr.close();
        } catch (IOException e) {
            throw new DataProcessingException("Error while processing data file.", e);
        }
    }
    public static void main(String[] args) {
        try {
            readData();
        } catch (DataProcessingException e) {
            System.out.println("Custom Exception Caught in main:");
            e.printStackTrace();
        }
    }
}


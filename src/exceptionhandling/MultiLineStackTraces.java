package exceptionhandling;
import java.io.*;
public class MultiLineStackTraces {
    static void check2() {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception in check2()");
            e.printStackTrace();
        }
    }
    static void check() {
        try {
            check2();
        } catch (Exception e) {
            System.out.println("Exception in check()");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            check();
        } catch (Exception e) {
            System.out.println("Exception in main()");
            e.printStackTrace();
        }
    }
}

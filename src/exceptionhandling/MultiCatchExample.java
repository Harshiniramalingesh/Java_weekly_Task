package exceptionhandling;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Number: " + numbers[5]);
            int result = 10 / 0;
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid array index accessed.");
        } catch (Exception e) {
            System.out.println("Caught Exception: Some other exception occurred.");
        }
    }
}

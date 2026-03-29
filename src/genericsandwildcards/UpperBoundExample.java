package genericsandwildcards;

import java.util.*;

public class UpperBoundExample {
    public static void sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        System.out.println("Sum = " + sum);
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(1.5, 2.5);
        sumNumbers(intList);
        sumNumbers(doubleList);
    }
}


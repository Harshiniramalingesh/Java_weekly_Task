package genericsandwildcards;

import java.util.*;

public class WildCardsExample {
    public static double sumList(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.0);
        double intSum = sumList(intList);
        double doubleSum = sumList(doubleList);
        System.out.println("Sum of Integer list: " + intSum);
        System.out.println("Sum of Double list: " + doubleSum);
    }
}


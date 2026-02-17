package genericsandwildcards;

import java.util.*;

public class LowerBoundExample {
    public static void addNumbers(List<? super Integer> list) {
        list.add(100);
        list.add(200);
        System.out.println(list);
    }
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
        addNumbers(intList);
        addNumbers(numberList);
        addNumbers(objectList);
    }
}


package collections;

import java.util.*;

public class ListPerformanceTest {
    public static void main(String[] args) {

        int n = 100000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for(int i = 0; i < n; i++) {
            arrayList.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList add at start: " + (end - start));

        start = System.currentTimeMillis();
        for(int i = 0; i < n; i++) {
            linkedList.add(0, i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList add at start: " + (end - start));
    }
}


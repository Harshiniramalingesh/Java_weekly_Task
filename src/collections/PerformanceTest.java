package collections;

import java.util.*;

public class PerformanceTest {
    public static void main(String[] args) {
        int n = 1_000_000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        int middle = n / 2;

        long start = System.nanoTime();
        arrayList.get(middle);
        long end = System.nanoTime();
        System.out.println("ArrayList get(): " + (end - start) + " ns");

        start = System.nanoTime();
        linkedList.get(middle);
        end = System.nanoTime();
        System.out.println("LinkedList get(): " + (end - start) + " ns");
    }
}


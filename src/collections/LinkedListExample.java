package collections;
import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("After add at end (O(1)): " + list);

        list.add(1, "X");
        System.out.println("After add at index (O(n)): " + list);

        String value = list.get(2);
        System.out.println("Get element (O(n)): " + value);

        list.set(2, "Z");
        System.out.println("After set (O(n)): " + list);

        list.remove(1);
        System.out.println("After remove by index (O(n)): " + list);

        list.remove("Z");
        System.out.println("After remove by object (O(n)): " + list);

        list.addFirst("Start");
        System.out.println("After addFirst (O(1)): " + list);

        list.addLast("End");
        System.out.println("After addLast (O(1)): " + list);

        list.removeFirst();
        System.out.println("After removeFirst (O(1)): " + list);

        list.removeLast();
        System.out.println("After removeLast (O(1)): " + list);
    }
}

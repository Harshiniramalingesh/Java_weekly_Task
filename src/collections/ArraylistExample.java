package collections;
import java.util.*;
public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("After add at end (O(1)): " + list);
        list.add(1, "X");
        System.out.println("After add at index (O(n)): " + list);

        String value = list.get(2);
        System.out.println("Get element (O(1)): " + value);

        list.set(2, "Z");
        System.out.println("After set (O(1)): " + list);

        list.remove(1);
        System.out.println("After remove by index (O(n)): " + list);

        list.remove("Z");
        System.out.println("After remove by object (O(n)): " + list);
    }
}

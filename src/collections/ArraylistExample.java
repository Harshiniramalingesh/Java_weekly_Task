package collections;
import java.util.*;
public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("After add at end: " + list);
        list.add(1, "X");
        System.out.println("After add at index: " + list);
        String value = list.get(2);
        System.out.println("Get element: " + value);

        list.set(2, "Z");
        System.out.println("After set: " + list);

        list.remove(1);
        System.out.println("After remove by index: " + list);
        list.remove("Z");
        System.out.println("After remove by object: " + list);
    }
}

package genericsandwildcards;
import java.util.*;
public class UnboundedWildCards {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<String> strList = Arrays.asList("A", "B", "C");

        printList(intList);
        printList(strList);
    }
}

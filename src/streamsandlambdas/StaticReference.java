package streamsandlambdas;
import java.util.*;

public class StaticReference {
    public static void print(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C");
        list.forEach(StaticReference::print);

        //list.forEach(s -> System.out.println(s));

    }
}

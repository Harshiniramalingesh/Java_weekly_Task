package streamsandlambdas;
import java.util.function.Predicate;
import java.util.*;
public class InstanceRefernceForParticularObject {
    public static void main(String[] args) {
        String str = "Java Programming";
        Predicate<String> p = str::equals;
        System.out.println(p.test("Java Programming"));
        System.out.println(p.test("Python"));
    }
}

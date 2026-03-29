package streamsandlambdas;
import java.util.function.Predicate;
public class InstanceMethodForArbitaryObject {
    public static void main(String[] args) {
        Predicate<String> p = String::isEmpty;
        System.out.println(p.test(""));
        System.out.println(p.test("Hello"));
    }
}

package abstractinterfaces;
interface Message{
    void sayHello();
}
interface ParameterExample{
    void addString(String Name);
}
public class LambdaExpressionExample {
    public static void main(String[] args) {
        Message msg = () -> System.out.println("Hello Java");
        msg.sayHello();

        ParameterExample p = (name) -> System.out.println("Hello " + name);
        p.addString("Harshini");
    }
}

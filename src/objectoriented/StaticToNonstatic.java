package objectoriented;

public class StaticToNonstatic {
    public static void main(String[] args) {
        fun();
        //Cannot use this keyword inside static method.
    }
    static void fun() {
        System.out.println("It is fun");
        StaticToNonstatic obj = new StaticToNonstatic();
        obj.greeting();
    }
    void greeting(){
        fun2();
        System.out.println("Hello world");
    }
void fun2() {
    System.out.println("It is double fun");
}
}

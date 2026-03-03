package streamsandlambdas;
@FunctionalInterface
interface A {
    void show();
}

//class B implements A{
//    public void show(){
//        System.out.println("Hello user");
//    }
//}
public class LambdasExample {
    public static void main(String[] args) {
//        A obj = new B();
//        A obj = new A(){
//            public void show(){
//                System.out.println("Hello user");
//            }
//
//        };

        A obj = () -> System.out.println("Hello user");
        obj.show();
    }
}

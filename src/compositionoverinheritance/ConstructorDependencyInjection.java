package compositionoverinheritance;
class Keyboard {
    void type() {
        System.out.println("Typing...");
    }
}
class Laptop {

    private Keyboard keyboard;

    public Laptop(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    void useLaptop() {
        keyboard.type();
        System.out.println("Laptop is working");
    }
}
public class ConstructorDependencyInjection {
    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard();  
        Laptop laptop = new Laptop(keyboard);

        laptop.useLaptop();
    }
}

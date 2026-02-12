package compositionoverinheritance;
class Ink {
    void fill() {
        System.out.println("Ink filled");
    }
}
class Printer {

    private Ink ink;

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    void print() {
        ink.fill();
        System.out.println("Printing document...");
    }
}
public class MethodDependencyInjection {
    public static void main(String[] args) {

        Printer printer = new Printer();

        Ink ink = new Ink();
        printer.setInk(ink);

        printer.print();
    }
}

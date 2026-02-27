package abstractinterfaces;
interface Printable{
    void print();
}
interface Scannable{
    void scan();
}

class SmartPrinter implements Printable,Scannable{
     public void print(){
        System.out.println("Printing Document");
    }
    public void scan(){
        System.out.println("Scanning Document");
    }
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        SmartPrinter sp = new SmartPrinter();

        sp.print();
        sp.scan();
    }
}

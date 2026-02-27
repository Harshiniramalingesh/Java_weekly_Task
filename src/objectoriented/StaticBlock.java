package objectoriented;



public class StaticBlock {
    static int a = 10;
    static int b;
// Static block will execute only once.
    static{
        System.out.println("This is a static block");
        b = a * 4;
    }

    static void main() {
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 10;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}

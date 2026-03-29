package org.object_oriented_properties;
class C
{
    public void disp()
    {
        System.out.println("C");
    }
}
class A extends C
{
    public void disp()
    {
        System.out.println("A");
    }
}
class B extends C
{
    public void disp()
    {

        System.out.println("B");
    }
}
class D extends A {

    public void disp() {
        super.disp();
        System.out.println("D");
    }
}
    public class HybridInheritance {
        public static void main(String args[]) {
            D obj = new D();
            obj.disp();
        }
    }


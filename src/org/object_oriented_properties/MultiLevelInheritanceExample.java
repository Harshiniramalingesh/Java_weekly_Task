package org.object_oriented_properties;
class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class BabyDog extends Dog{

    void weep(){
        super.bark();
        System.out.println("weeping...");}
}
public class MultiLevelInheritanceExample {
    public static void main(String[] args){
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }



}

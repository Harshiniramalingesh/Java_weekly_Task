package compositionoverinheritance;
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
// IS-a Relationship
class Cat extends Animal{
    void eat() {
        System.out.println("Cat eat fish");
    }
}
public class Is_a_Relationship {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();
    }

}

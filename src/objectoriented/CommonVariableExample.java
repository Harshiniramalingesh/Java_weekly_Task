package objectoriented;
class Human{
    int age;
    String name;
    boolean married;
    static long population;
    Human(int age,String name,boolean married){
        this.age = age;
        this.name = name;
        this.married = married;
        this.population += 1;
    }

}
public class CommonVariableExample {
    public static void main(String[] args){
        Human kunal = new Human(23,"Kunal",false);
        Human rahul = new Human(21,"Rahul",true);

        System.out.println(kunal.population);
        System.out.println(Human.population);
    }

}

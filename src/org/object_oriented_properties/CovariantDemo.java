package org.object_oriented_properties;

class Animal1 {
    Animal1 getAnimal() {
        System.out.println("Returning Animal");
        return new Animal1();
    }
}

class Dog1 extends Animal1 {

    @Override
    Dog1 getAnimal() {
        System.out.println("Returning Dog");
        return new Dog1();
    }
}

public class CovariantDemo {
    public static void main(String[] args) {

        Animal1 a = new Dog1();
        a.getAnimal();

        Dog1 d = new Dog1();
        Dog1 dog = d.getAnimal();
        System.out.println(dog);
    }
}

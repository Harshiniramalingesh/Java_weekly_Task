package collections;

import java.util.*;
class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return this.id == p.id;
    }
}

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person(1, "A");
        Person p2 = new Person(1, "B");
        map.put(p1, "Engineer");
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("Value using p2: " + map.get(p2));
        System.out.println("Map size: " + map.size());
    }
}


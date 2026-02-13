package collections;

import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return 10;
    }
    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id;
    }
}

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student(1, "A"), "Math");
        map.put(new Student(2, "B"), "Physics");
        map.put(new Student(3, "C"), "Chemistry");
        System.out.println(map.size());
        System.out.println(map.get(new Student(1, "X")));
    }
}


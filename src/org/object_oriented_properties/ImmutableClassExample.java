package org.object_oriented_properties;
final class Employee {

    private final int id;
    private final String name;
    private final double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class ImmutableClassExample {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "Harshini", 50000);

        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

        System.out.println("Employee object is immutable");
    }
}

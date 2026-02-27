package streamsandlambdas;
import java.util.*;
import java.util.stream.*;
class Employee {
    private String name;
    private String department;
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
    @Override
    public String toString() {
        return name;
    }
}

public class GroupingExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Harshini", "IT"),
                new Employee("Ravi", "HR"),
                new Employee("Anu", "IT"),
                new Employee("Kiran", "Finance"),
                new Employee("Meena", "HR")
        );

        Map<String, List<Employee>> groupedEmployees =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        groupedEmployees.forEach((dept, empList) -> {
            System.out.println(dept + " -> " + empList);
        });
    }
}


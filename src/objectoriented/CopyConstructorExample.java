package objectoriented;
 class Employee{
    String name;
    String role;

    Employee(String name,String role){
        this.name = name;
        this.role = role;
    }

    Employee(Employee em){
        name = em.name;
        role = em.role;
    }

    void displayInfo(){
        System.out.println(this.name + " " + this.role);
    }


}

public class CopyConstructorExample {
    public static void main(String[] args){
        Employee e1 = new Employee("Sathiya","Developer");
        Employee e2 = new Employee(e1);
        e1.displayInfo();
        e1.displayInfo();
    }

}

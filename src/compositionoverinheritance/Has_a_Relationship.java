package compositionoverinheritance;
class Address{
    String city;
    String pinCode;

    Address(String city,String pinCode){
        this.city = city;
        this.pinCode = pinCode;
    }
    void displayInfo(){
        System.out.println("City: " + this.city + " " + "PinCode: " + this.pinCode);
    }

}
class Person{
    String name;
    Address address;

    Person(String name,Address address){
        this.name = name;
        this.address = address;
    }

    void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Address: ");
        address.displayInfo();
    }
}
public class Has_a_Relationship {
    public static void main(String[] args) {
        Address address = new Address("Coimbatore", "12345");

        Person person = new Person("Harshini", address);
        person.displayInfo();
    }
}

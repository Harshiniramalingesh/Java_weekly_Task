package objectoriented;

class Student{
    int rno;
    String name;
    float marks;

    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;

        System.out.println("Roll no: " + this.rno + " Name: " + this.name + " Marks: " + this.marks);
    }


    Student(){
        this.rno = 12;
        this.name = "Rani";
        this.marks = 99.9f;

        System.out.println("Roll no: " + this.rno + " Name: " + this.name + " Marks: " + this.marks);
    }


}

public class StudentDetails {
    public static void main(String[] args) {
        Student harshini = new Student(36,"Harshini",95);
        Student kavya = new Student(37,"KavyaShree",100);
        Student prathish = new Student(35,"Prathish",95);

        Student rani = new Student();

        Student raja = new Student();
        raja.rno = 11;
        raja.name = "Raja";
        raja.marks = 100.0f;

        System.out.println("Roll no: " + raja.rno + " Name: " + raja.name + " Marks: " + raja.marks);





    }
}

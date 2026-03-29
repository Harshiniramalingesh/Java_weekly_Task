package objectoriented;
class StudentInfo{
    int rno;
    String dept;
    int fees;

    void insertDetails(int rno,String dept,int fees){
        this.rno = rno;
        this.dept = dept;
        this.fees = fees;
    }

    void displayDetails(){
        System.out.println("Student Roll No : " + this.rno + " Student Department : " + this.dept + " Student fees Details : " + this.fees);
    }


}

public class ObjectInitializationThroughMethods {
    public static void main(String[] args){
        StudentInfo s1 = new StudentInfo();
        StudentInfo s2 = new StudentInfo();

        s1.insertDetails(36,"ECE",20000);
        s2.insertDetails(37,"CSE",50000);

        s1.displayDetails();
        s2.displayDetails();
    }
}


/*
1. Write a Java program to create a `Student` class to store and display student details using a method.
*/

public class Student {
    String name;
    int rollNo;
    String branch;
    String mailId;

    public void setStudentDetails(String name, int rollNo, String branch, String mailId){
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.mailId = mailId;
    }
    public void displayStudentDetails(){
        System.out.println("Name : " +this.name);
        System.out.println("Roll No : " +this.rollNo);
        System.out.println("Branch : " +this.branch);
        System.out.println("Mail ID : " +this.mailId);
    }
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setStudentDetails("Sipun", 123, "CSE", "sipun@gmail.com");
        s1.displayStudentDetails();
    }    
}
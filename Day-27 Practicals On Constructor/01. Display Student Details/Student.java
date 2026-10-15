
/*
1. Create a `Student` class with student name, roll number, and marks. 
Create an object and display the student details using a method.
*/

public class Student {
    String name;
    int rollNo;
    int marks;

    public void setStudentDetails(String name, int rollNo, int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public void displayStudentDetails(){
        System.out.println("Name : " +this.name);
        System.out.println("Roll No : " +this.rollNo);
        System.out.println("Marks : " +this.marks);
    }
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setStudentDetails("Sipun", 123, 500);
        s1.displayStudentDetails();
    }    
}
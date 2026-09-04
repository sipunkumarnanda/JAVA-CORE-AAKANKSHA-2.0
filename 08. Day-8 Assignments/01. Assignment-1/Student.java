
/* Q1. Write a Java program to declare `name`, `rollNo`, and `marks` 
as instance variables inside a `Student` class. Assign suitable values
to the variables and display the student's name, roll number, and marks. */

public class Student {
    String name = "Sipun Kumar Nanda";
    int rollNo = 01;
    int marks = 90;

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Name : " + s1.name);
        System.out.println("Roll No : " + s1.rollNo);
        System.out.println("Marks : " + s1.marks);
    }
}

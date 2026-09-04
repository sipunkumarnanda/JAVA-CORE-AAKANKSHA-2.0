/* Q4. Write a Java program to create a method named `displayStudent()` 
that accepts the student's `name`, `age`, and `marks` as parameters. 
Display all the values received by the method. */

public class DisplayStudentDetails {
    public static void displayStudent(String name, int age, int marks) {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Marks : " + marks);
    }

    public static void main(String[] args) {
        displayStudent("Sipun Kumar", 24, 100);
    }
}

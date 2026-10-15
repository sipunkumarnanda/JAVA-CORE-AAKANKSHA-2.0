
/*
8\. Create a `Student` class with name, roll number, and department. Initialize these values using a constructor and display them using a method.
*/

public class Student {
    String name;
    int rollNumber;
    String department;

    Student(String name, int rollNumber, String department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Roll Number : " + this.rollNumber);
        System.out.println("Department : " + this.department);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alex", 101, "Computer Science");
        s1.displayDetails();
    }
}

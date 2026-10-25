
/*
11\. Create a `Student` class using constructor + setter validation.
*/

public class Student {
    private String name;
    private int rollNumber;
    private int marks;

    Student(String name, int rollNumber, int marks) {
        setName(name);
        setRollNumber(rollNumber);
        setMarks(marks);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name can not be empty");
        }
    }

    public int getRollNumber() {
        return this.rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        if (rollNumber > 0) {
            this.rollNumber = rollNumber;
        } else {
            System.out.println("Invalid roll number");
        }
    }

    public int getMarks() {
        return this.marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks, marks must be between 0 to 100");
        }
    }

    public void displayDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Roll Number : " + this.rollNumber);
        System.out.println("Marks : " + this.marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alex", 101, 85);
        s1.displayDetails();

        System.out.println();

        Student s2 = new Student("John", -5, 120);
        s2.displayDetails();
    }
}

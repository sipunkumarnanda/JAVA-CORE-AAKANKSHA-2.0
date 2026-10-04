/*
14. Write a Java program to create a `Student` class and create three different objects to store and display the details of three students.
*/

public class Student {
    String name;
    String collegeName;
    int rollNo;
    long mobileNumber;

    Student(String name, String collegeName, int rollNo, long mobileNumber){
        this.collegeName = collegeName;
        this.name = name;
        this.rollNo = rollNo;
        this.mobileNumber = mobileNumber;
    }

    public void displayStudentDetails(){
        System.out.println("Name : " +this.name);
        System.out.println("College Name : " +this.collegeName);
        System.out.println("Roll No : " +this.rollNo);
        System.out.println("Mobile Number : " +this.mobileNumber + "\n");
    }
    public static void main(String[] args) {
        Student s1 = new Student("Sipun Kumar", "Seemanta Engineering College", 26, 9668123456l);
        Student s2 = new Student("Abhisek Singh", "OUTR", 65, 9968123456l);
        Student s3 = new Student("Dev Kumar", "Seemanta Engineering College", 99, 7868123456l);

        s1.displayStudentDetails();
        s2.displayStudentDetails();
        s3.displayStudentDetails();
    }
}

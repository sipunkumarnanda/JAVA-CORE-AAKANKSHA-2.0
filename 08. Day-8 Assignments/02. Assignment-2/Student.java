
/* Q2. Write a Java program to declare `collegeName` as a static variable inside a 
`Student` class. Assign a suitable value to the static variable and display the college name.
*/

public class Student {
    static String collegeName = "Seemanta Engineering College";

    public static void main(String[] args) {
        System.out.println("College Name is : " + Student.collegeName);
    }
}

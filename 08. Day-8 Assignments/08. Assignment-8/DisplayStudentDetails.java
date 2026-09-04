/* Q8. Write a Java program to declare `studentName` as an instance variable and 
`collegeName` as a static variable. Create a method that accepts three subject marks 
as parameters. Calculate the total marks using a local variable and display the student's 
complete details.
 */

public class DisplayStudentDetails {
    String studentName;
    static String collegeName;

    public int assignMarks(int sub1, int sub2, int sub3) {
        int totalMarks = sub1 + sub2 + sub3;
        return totalMarks;
    }

    public void setStudentDetails(String collegeName, String studentName) {
        DisplayStudentDetails.collegeName = collegeName;
        this.studentName = studentName;

    }

    public void displayStudentDetails(int totalMarks) {
        System.out.println("Student Name : " + this.studentName);
        System.out.println("College Name : " + DisplayStudentDetails.collegeName);
        System.out.println("Total Marks : " + totalMarks);
    }

    public static void main(String[] args) {

        DisplayStudentDetails s1 = new DisplayStudentDetails();

        int totalMarks = s1.assignMarks(80, 90, 100);

        s1.setStudentDetails("Seemanta Engineering College", "Sipun Kumar Nanda");

        s1.displayStudentDetails(totalMarks);
    }
}

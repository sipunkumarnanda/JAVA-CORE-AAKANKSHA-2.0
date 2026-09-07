/*
5. Write a Java program to declare float variables for marks in three subjects 
and calculate and display the total marks and average marks.
*/

public class CalculateMarks {
    public static void main(String[] args) {
        float sub1Mark = 99.50f;
        float sub2Mark = 88.25f;
        float sub3Mark = 70.50f;

        float totalMarks = sub1Mark + sub2Mark + sub3Mark;
        float averageMarks = totalMarks/3;

        System.out.println("Total Mark : " + totalMarks);
        System.out.println("Average Mark : " + averageMarks);
    }
}

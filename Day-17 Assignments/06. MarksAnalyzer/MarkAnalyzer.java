import java.util.Scanner;

public class MarkAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students : ");
        int size = sc.nextInt();
        int marks[] = new int[size];

        System.out.println("Enter students marks : ");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter num" + (i + 1) + " : ");
            marks[i] = sc.nextInt();
        }

        int totalMarksOfAllStudents = 0;
        int highestMark = marks[0];
        int lowestMark = marks[0];
        int numberOfPassedStudents = 0;
        int numberOfFailedStudents = 0;

        for (int i = 0; i < marks.length; i++) {
            totalMarksOfAllStudents += marks[i];

            if (marks[i] >= 40) {
                numberOfPassedStudents++;
            } else {
                numberOfFailedStudents++;
            }

            if (marks[i] > highestMark) {
                highestMark = marks[i];
            }

            if (marks[i] < lowestMark) {
                lowestMark = marks[i];
            }
        }

        System.out.println("Highest Marks is : " + highestMark);
        System.out.println("Lowest Marks is : " + lowestMark);
        System.out.println("Average Marks is : " + totalMarksOfAllStudents / size);
        System.out.println("Number of total passed students : " + numberOfPassedStudents);
        System.out.println("Number of total failed students : " + numberOfFailedStudents);

        sc.close();
    }
}

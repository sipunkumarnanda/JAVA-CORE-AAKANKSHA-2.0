import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[10];

        int heighestMark = Integer.MIN_VALUE;
        int lowestMark = Integer.MAX_VALUE;
        int heighestMarkIndex = -1;
        int lowestMarkIndex = -1;
        int totalMarks = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter num" + (i + 1) + " : ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
            if (marks[i] > heighestMark) {
                heighestMark = marks[i];
                heighestMarkIndex = i;
            }
            if (marks[i] < lowestMark) {
                lowestMark = marks[i];
                lowestMarkIndex = i;
            }
        }

        int marksAbove75 = 0, marksAbove60 = 0, marksAbove40 = 0, numberOfFailedStudent = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 75) {
                marksAbove75++;
            } else if (marks[i] >= 60) {
                marksAbove60++;
            } else if (marks[i] >= 40) {
                marksAbove40++;
            } else {
                numberOfFailedStudent++;
            }
        }

        System.out.println(
                "Heighest mark of student is : " + heighestMark + " is present at index : " + heighestMarkIndex);
        System.out.println("Lowest mark of student is : " + lowestMark + " is present at index : " + lowestMarkIndex);
        System.out.println("Average Marks of all student is : " + (totalMarks / marks.length));
        System.out.println("Number of student scoring above 75 is : " + marksAbove75);
        System.out.println("Number of student scoring between 60 to 74 is : " + marksAbove60);
        System.out.println("Number of student scoring between 40 to 59 is : " + marksAbove40);
        System.out.println("Number of failed student is : " + numberOfFailedStudent);
        sc.close();
    }
}

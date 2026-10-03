/*
9. Grade Calculation Using Array Write a Java program to input marks of 5 subjects into an array.
 Calculate total and percentage and assign a grade:Percentage Grade ≥ 90 A+ ≥ 80 A≥ 70 B≥ 60 C≥ 50 D≥ 40 E< 40 F 
 Also check whether the student has passed all subjects.
*/

import java.util.Scanner;

public class CalculateGrade {
    //  method for finding grade
    public static String findGrade(double percentage) {
        if (percentage >= 90.00) {
            return "A+";
        } else if (percentage >= 80.00) {
            return "A";
        } else if (percentage >= 70.00) {
            return "B";
        } else if (percentage >= 60.00) {
            return "C";
        } else if (percentage >= 50.00) {
            return "D";
        } else if (percentage >= 40.00) {
            return "E";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[5];
        int totalMark = 0;
        boolean isPassed = true;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark of sub " + (i + 1) + " : ");
            int mark = sc.nextInt();
            if (mark >= 0 && mark <= 100) {
                if (mark >= 40) {
                    marks[i] = mark;
                    totalMark += mark;
                } else {
                    isPassed = false;
                }
            } else {
                System.out.println("Invalid number enter the number between 0 and 100");
                i--;
            }
        }

        double percentage = (totalMark / 500.00) * 100.00;
        System.out.println("Total Mark : " +totalMark);
        System.out.println("Percentage : " +percentage);
        System.out.println("Grade : " + findGrade(percentage));
        System.out.println("Result : " + (isPassed ? "PASS" : "FAIL"));

        sc.close();
    }
}

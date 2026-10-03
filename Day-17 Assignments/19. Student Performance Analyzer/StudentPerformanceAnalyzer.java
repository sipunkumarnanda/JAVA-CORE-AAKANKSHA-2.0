/*
19. Student Performance Analyzer Write a Java program to input the name and marks of 5 students.For each student, 
calculate the grade using conditional statements.Display:Name Marks Percentage/Grade ResultAlso find:Highest scorerLowest scorerClass 
averageNumber of passed studentsNumber of failed students
*/

import java.util.Scanner;

public class StudentPerformanceAnalyzer {
    public static String findGrade(double mark) {
        if (mark >= 90) {
            return "A+";
        } else if (mark >= 80) {
            return "A";
        } else if (mark >= 70) {
            return "B";
        } else if (mark >= 60) {
            return "C";
        } else if (mark >= 50) {
            return "D";
        } else if (mark >= 40) {
            return "E";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names[] = new String[5];
        double marks[] = new double[5];

        double totalMarks = 0;
        double highestScore = Integer.MIN_VALUE;
        int highestScoreIndex = -1;
        double lowestScore = Integer.MAX_VALUE;
        int lowesttScoreIndex = -1;
        int countPassedStudent = 0;
        int countFailedStudent = 0;

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name of student NO " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter mark in percentage of student NO " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
            sc.nextLine();
            totalMarks += marks[i];
            if (marks[i] > highestScore) {
                highestScore = marks[i];
                highestScoreIndex = i;

            }
            if (marks[i] < lowestScore) {
                lowestScore = marks[i];
                lowesttScoreIndex = i;
            }
            if (marks[i] >= 40) {
                countPassedStudent++;
            } else {
                countFailedStudent++;
            }
        }

        System.out
                .println("\nHighest score is " + highestScore + "% and his/her name is : " + names[highestScoreIndex]);
        System.out.println("Lowest score is " + lowestScore + "% and his/her name is : " + names[lowesttScoreIndex]);
        System.out.println("Average mark is : " + totalMarks / marks.length + "%");
        System.out.println("Number of passed student is : " + countPassedStudent);
        System.out.println("Number of failed student is : " + countFailedStudent);

        System.out.println("\nAll student details");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Name : " + names[i]);
            System.out.println("Mark in percentage : " + marks[i] + "%");
            System.out.println("Result : " + findGrade(marks[i]));
            System.out.println();
        }
        sc.close();
    }
}

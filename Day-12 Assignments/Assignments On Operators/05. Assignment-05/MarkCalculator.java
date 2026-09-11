/*
5. Write a Java program to accept marks of three subjects and calculate the total marks, percentage, and average using arithmetic operators.
*/

import java.util.Scanner;

public class MarkCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the mark of subject 1 : ");
        int sub1Mark = sc.nextInt();

        System.out.println("Enter the mark of subject 2 : ");
        int sub2Mark = sc.nextInt();

        System.out.println("Enter the mark of subject 3 : ");
        int sub3Mark = sc.nextInt();

        int totalMarks = sub1Mark + sub2Mark + sub3Mark;
        float percantage = (totalMarks/300.0f) * 100;
        float averageMark = totalMarks/3;

        System.out.println("Total Marks is : " +totalMarks);
        System.out.println("Percantage : " +percantage);
        System.out.println("Average Marks is : " +averageMark);

        sc.close();
    }
}

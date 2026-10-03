/*
1. Student Result Write a Java program to input a student's name, roll number, and marks in three subjects using Scanner. 
Calculate the total and percentage and display whether the student has Passed or Failed. Condition: Pass if marks in every subject are ≥ 33.
*/

import java.util.Scanner;

class EvaluateStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Student Roll No : ");
        int rollNo = sc.nextInt();
        int marks[] = new int[3];
        
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark of subject " + (i + 1) + " : ");
            marks[i] = sc.nextInt();
        }

        int totalMarks = 0;
        boolean isPass = true;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 33) {
                totalMarks += marks[i];
            } else {
                isPass = false;
            }
        }

        String result = isPass ? "PASS" : "FAIL";

        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Result : " + result);

        sc.close();
    }
}
/*
9. Write a Java program to accept a student's marks and attendance in percentage and determine whether 
the student is eligible to appear for the examination using nested if-else.
*/

import java.util.Scanner;

public class ExamRegistrationValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the mark of student in percentage : ");
        int mark = sc.nextInt();

        System.out.println("Enter the attendance of student in percentage : ");
        float attendance = sc.nextFloat();

        if(attendance >= 70.0f){
            if(mark >= 40){
                System.out.println("The above student is eligible for examination");
            }else{
                System.out.println("The above student is not eligible for examination due to poor marks");
            }
        }else{
            System.out.println("The above student is not eligible for examination due to poor attendance");
        }
        
        sc.close();
    }
}

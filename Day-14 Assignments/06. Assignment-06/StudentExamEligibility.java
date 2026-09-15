import java.util.Scanner;

/**
 6.    Write a Java program to input a student's marks and attendance percentage and determine
  whether the student is eligible for the examination using nested if-else.
 */
public class StudentExamEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student mark in percentage : ");
        float mark = sc.nextFloat();

        System.out.print("Enter student attendance in percentage : ");
        float attendance = sc.nextFloat();

        if(attendance >= 70.0f){
            if(mark >= 40.0f){
                System.out.println("You are eligible for exam");
            }else{
                System.out.println("You are not eligible for exam due to poor marks");
            }
        }else{
            System.out.println("You are not eligible for exam due to poor attendance");
        }
        sc.close();
    }
}
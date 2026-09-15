// 5.    Write a Java program to input a student's marks and display the grade using an else-if ladder.

import java.util.Scanner;

public class DisplayGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark of student in percentage : ");
        float mark = sc.nextFloat();
        if(mark > 100.0f || mark < 0.0f){
            System.out.println("Invalid Number");
        }else if(mark >= 90.0f){
            System.out.println("Grade : O");
        }else if(mark >= 80.0f){
            System.out.println("Grade : E");
        }else if(mark >= 70.0f){
            System.out.println("Grade : A");
        }else if(mark >= 60.0f){
            System.out.println("Grade : B");
        }else if(mark >= 50.0f){
            System.out.println("Grade : C");
        }else if(mark >= 40.0f){
            System.out.println("Grade : D");
        }else{
            System.out.println("Grade : Fail");
        }
        sc.close();
    }
}

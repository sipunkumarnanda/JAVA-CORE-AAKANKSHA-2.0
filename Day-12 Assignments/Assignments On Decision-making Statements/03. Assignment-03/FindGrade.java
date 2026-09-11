/*
3. Write a Java program to accept a student's marks and display the grade using an else-if ladder.
*/

import java.util.Scanner;

public class FindGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the mark of student : ");
        int mark = sc.nextInt();

        if(mark >= 90){
            System.out.println("Grade : O");
        }else if(mark >= 80){
            System.out.println("Grade : E");
        }else if(mark >= 70){
            System.out.println("Grade : A");
        }else if(mark >= 60){
            System.out.println("Grade : B");
        }else if(mark >= 50){
            System.out.println("Grade : C");
        }else if(mark >= 40){
            System.out.println("Grade : D");
        }else {
            System.out.println("Grade : FAIL");
        }
        sc.close();
    }
}

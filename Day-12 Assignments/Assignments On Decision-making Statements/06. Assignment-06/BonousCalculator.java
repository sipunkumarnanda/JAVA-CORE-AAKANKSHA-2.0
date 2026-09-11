/*
6. Write a Java program to accept an employee's salary and years of experience and determine whether the employee is eligible for a bonus using nested if-else.
*/

import java.util.Scanner;

public class BonousCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter salary of the employee : ");
        double salary = sc.nextDouble();
        System.out.println("Enter year of experience of the employee : ");
        float experience = sc.nextFloat();

        if(salary >= 50000){
            if(experience >= 1.5){
                System.out.println("The above employee is eligible for Bonous");
            }else{
                System.out.println("The above employee is not eligible for Bonous");
            }
        }else{
            System.out.println("The above employee is not eligible for Bonous");
        }
        sc.close();
    }
}

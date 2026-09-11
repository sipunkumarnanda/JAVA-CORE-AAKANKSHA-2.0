

/*
1. Write a Java program to accept two numbers and calculate their sum, difference, product, quotient, and remainder using arithmetic operators.
*/

import java.util.Scanner;

public class ArithmaticCalculation {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the num1 : ");
       int num1 = sc.nextInt();
       System.out.println("Enter the num2 : ");
       int num2 = sc.nextInt();

       int sum = num1 + num2;
       int difference = num1 - num2 ;
       int product = num1 * num2;
       int quotient = num1 / num2;
       int remender = num1 % num2;

       System.out.println(num1 +" + "+ num2 +" = "+ sum);
       System.out.println(num1 +" - "+ num2 +" = "+ difference);
       System.out.println(num1 +" * "+ num2 +" = "+ product);
       System.out.println(num1 +" ÷ "+ num2 +" = "+ quotient);
       System.out.println(num1 +" % "+ num2 +" = "+ remender);
       sc.close();
    }    
}
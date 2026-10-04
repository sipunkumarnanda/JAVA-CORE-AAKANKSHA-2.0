/*
5. Write a Java program to create a `Calculator` class with methods for addition, subtraction, multiplication, and division.
*/

import java.util.Scanner;

public class Calculator {

    public static int sum(int num1, int num2){
        return num1 + num2; 
    }
    public static int subtract(int num1, int num2){
        return num1 - num2; 
    }
    public static int multiplication(int num1, int num2){
        return num1 * num2; 
    }
    public static int division(int num1, int num2){
        return num1 / num2; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second number : ");
        int num2 = sc.nextInt();

        System.out.println(num1 +" + "+ num2 +" = "+ sum(num1, num2));
        System.out.println(num1 +" - "+ num2 +" = "+ subtract(num1, num2));
        System.out.println(num1 +" X "+ num2 +" = "+ multiplication(num1, num2));
        System.out.println(num1 +" / "+ num2 +" = "+ division(num1, num2));
    }
}

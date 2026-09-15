
/**
 11.    Write a Java program to create a simple calculator using switch-case for addition, subtraction, multiplication, division, and modulus. 
 */

import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter num1 : ");
            int num1 = sc.nextInt();

            System.out.print("Enter num2 : ");
            int num2 = sc.nextInt();

            System.out.println(
                    "Enter 1 for addition \nEnter 2 for subtraction \nEnter 3 for multiplication \nEnter 4 for division \nEnter 5 for modulus operation");
            int operation = sc.nextInt();

        switch (operation) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " X " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println(num1 + " ÷ " + num2 + " = " + (num1 / num2));
                break;
            case 5:
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                break;
            default:
                System.out.println("You have entered an invalid input , please give a valid input ");
                break;
        }
        sc.close();
    }
}
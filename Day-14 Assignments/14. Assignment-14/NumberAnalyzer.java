// 14.    Write a Java program to create a menu-driven program using switch-case to check Even/Odd, Positive/Negative, and find Square/Cube.

import java.util.Scanner;

public class NumberAnalyzer {
    public static void numberAlalyzer(int num, int val) {
        switch (val) {
            case 1:
                if (num % 2 == 0) {
                    System.out.println(+num + " is even");
                } else {
                    System.out.println(+num + " is odd");
                }
                break;
            case 2:
                if (num > 0) {
                    System.out.println(+num + " is positive");
                } else if (num == 0) {
                    System.out.println(+num + " its zero");
                } else {
                    System.out.println(+num + " is negative");
                }
                break;
            case 3:
                System.out.println("Square of " + num + " is " + (num * num));
                System.out.println("Cube of " + num + " is " + (num * num * num));
                break;
            default:
                System.out.println("You have entered an invalid input , please try again");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            System.out.println(
                    "Press 1 for check even/odd\nPress 2 for check number is positive or negative\nPress 3 for find square and cube");
            int val = sc.nextInt();
            numberAlalyzer(num, val);
            System.out.println("\nEnter ctrl + c to exit the loop");
        }
    }
}

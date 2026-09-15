// 13.    Write a Java program to input a month number and display the number of days in that month using switch-case.

import java.util.Scanner;

public class PrintNumberOfDays {
    public static void printNumberOfDays(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println("For month number 1, it is January and it has 31 days.");
                break;
            case 2:
                System.out.println("For month number 2, it is February and it has 28 or 29 days.");
                break;
            case 3:
                System.out.println("For month number 3, it is March and it has 31 days.");
                break;
            case 4:
                System.out.println("For month number 4, it is April and it has 30 days.");
                break;
            case 5:
                System.out.println("For month number 5, it is May and it has 31 days.");
                break;
            case 6:
                System.out.println("For month number 6, it is June and it has 30 days.");
                break;
            case 7:
                System.out.println("For month number 7, it is July and it has 31 days.");
                break;
            case 8:
                System.out.println("For month number 8, it is August and it has 31 days.");
                break;
            case 9:
                System.out.println("For month number 9, it is September and it has 30 days.");
                break;
            case 10:
                System.out.println("For month number 10, it is October and it has 31 days.");
                break;
            case 11:
                System.out.println("For month number 11, it is November and it has 30 days.");
                break;
            case 12:
                System.out.println("For month number 12, it is December and it has 31 days.");
                break;
            default:
                System.out.println("You have entered an invalid number. Please enter a number between 1 and 12.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the month in number : ");
            int monthNumber = sc.nextInt();
            printNumberOfDays(monthNumber);
            System.out.println("\nEnter ctrl + c to exit the loop");
        }
    }
}

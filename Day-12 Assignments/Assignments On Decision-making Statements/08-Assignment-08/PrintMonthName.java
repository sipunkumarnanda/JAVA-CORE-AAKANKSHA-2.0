/*
8. Write a Java program to accept a number from 1 to 12 and display the corresponding month name and number of days using switch-case.
*/

import java.util.Scanner;

public class PrintMonthName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month in number : ");
        int monthNumber = sc.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("For month number 1 , it is January");
                break;
            case 2:
                System.out.println("For month number 2 , it is February");
                break;
            case 3:
                System.out.println("For month number 3 , it is March");
                break;
            case 4:
                System.out.println("For month number 4 , it is April");
                break;
            case 5:
                System.out.println("For month number 5 , it is May");
                break;
            case 6:
                System.out.println("For month number 6 , it is June");
                break;
            case 7:
                System.out.println("For month number 7 , it is July");
                break;
            case 8:
                System.out.println("For month number 8 , it is August");
                break;
            case 9:
                System.out.println("For month number 9 , it is September");
                break;
            case 10:
                System.out.println("For month number 10 , it is October");
                break;
            case 11:
                System.out.println("For month number 11 , it is November");
                break;
            case 12:
                System.out.println("For month number 12 , it is December");
                break;
        
            default:
                System.out.println("You have entered an invalid number , enter the number between 1 to 12");
                break;
        }
    }
}

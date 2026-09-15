// 12.    Write a Java program to input a number from 1 to 7 and display the corresponding day of the week using switch-case.

import java.util.Scanner;

public class PrintDay {
    public static void printDayName(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("For day number 1, it is Monday");
                break;
            case 2:
                System.out.println("For day number 2, it is Tuesday");
                break;
            case 3:
                System.out.println("For day number 3, it is Wednesday");
                break;
            case 4:
                System.out.println("For day number 4, it is Thursday");
                break;
            case 5:
                System.out.println("For day number 5, it is Friday");
                break;
            case 6:
                System.out.println("For day number 6, it is Saturday");
                break;
            case 7:
                System.out.println("For day number 7, it is Sunday");
                break;
            default:
                System.out.println("You have entered an invalid number, please enter a number between 1 and 7.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the Day in number : ");
            int dayNumber = sc.nextInt();
            printDayName(dayNumber);
            System.out.println("\nEnter ctrl + c for exit\n");
        }
    }
}

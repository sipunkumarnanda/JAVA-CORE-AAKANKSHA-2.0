// 28.    Write a Java program to continuously accept numbers from the user and terminate the loop when a negative number is entered using break.

import java.util.Scanner;

public class BreakWhenNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        while (true) {
            if (num >= 0) {
                System.out.print("Enter a number : ");
                num = sc.nextInt();
            } else {
                break;
            }
        }
        sc.close();
    }
}

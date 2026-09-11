/*
1. Write a Java program to accept a number and check whether it is positive, negative, or zero using an if-else-if ladder.
*/

import java.util.Scanner;

public class CheckPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which you wnat to check is this negative , positive or zero : ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("The given  number " +num+" is positive number");
        }else if(num < 0){
            System.out.println("The given  number " +num+" is negative number");
        }else{
            System.out.println("The given  number " +num+" is Zero");
        }
        sc.close();
    }
}

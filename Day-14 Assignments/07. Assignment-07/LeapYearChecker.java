/*
7.    Write a Java program to input a year and check whether it is a leap year or not.
*/

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check if it is leap year or not : ");
        int year = sc.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(+year+ " is a leap year");
        }else{
            System.out.println(+year+ " is not a leap year");
        }
        sc.close();
    }
}

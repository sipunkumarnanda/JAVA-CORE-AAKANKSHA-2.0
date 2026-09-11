/*
4. Write a Java program to accept a year and check whether it is a leap year or not using if-else.
*/

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year which you want to check is this a leap year or not : ");
        int year = sc.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(+year +" is a leap year");
        }else{
            System.out.println(+year + " is not a leap year");
        }
        sc.close();
    }
}

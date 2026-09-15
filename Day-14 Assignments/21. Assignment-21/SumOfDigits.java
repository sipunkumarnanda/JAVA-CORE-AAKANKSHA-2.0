// 21.    Write a Java program to input a number and calculate the sum of its digits using a while loop.

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find the sum of its digits:");
        int num = sc.nextInt();
        int copyNum = num;

        int sum = 0; 

        while(num != 0){
            int lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
        }

        System.out.println("Sum of all digits of "+copyNum+ " is "+ sum);
        sc.close();
    }
}

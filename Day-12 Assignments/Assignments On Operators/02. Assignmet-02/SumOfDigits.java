/*
2. Write a Java program to accept a three-digit number and calculate the sum of its digits using arithmetic and modulus operators.
*/

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int copyNum = num;
        int sum = 0;
        while(num % 10 != 0){
            int remender = num % 10;
            sum += remender;
            num = num / 10;
        }
        System.out.println("Sum of all digits in "+copyNum+ " = " +sum);
        sc.close();
    }
}

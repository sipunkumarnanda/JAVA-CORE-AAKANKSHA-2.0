// 23.    Write a Java program to input a number and count the number of digits using a while loop.

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to count its digits : ");
        long num = sc.nextLong();
        long copyNum = num;

        int count = 0;

        while(num != 0){
            num = num / 10;
            count++;
        }

        System.out.println("Number of digits in "+copyNum+ " is "+count);
        sc.close();
    }
}

// 22.    Write a Java program to input a number and check whether it is a palindrome number using a while loop.

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check if it is a palindrome : ");
        int num = sc.nextInt();

        int copyNum = num;
        int reverse = 0;

        while(num != 0){
            int lastDigit = num % 10 ;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }

        if(copyNum == reverse) {
            System.out.println(copyNum + " is a plaindrome number");
        }else{
            System.out.println(copyNum + " is not a plaindrome number");
        }
        sc.close();
    }
}

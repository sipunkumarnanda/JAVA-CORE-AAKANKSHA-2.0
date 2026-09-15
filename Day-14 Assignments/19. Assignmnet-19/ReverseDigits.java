// 19.    Write a Java program to input a number and reverse its digits using a for or while loop.

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to reverse : ");
        int num = sc.nextInt();
        int reverseNumber = 0;

        while(num != 0){
            if(num % 10 != 0){
                int lastDigit = num % 10;
                reverseNumber = (reverseNumber * 10) + lastDigit;
                num = num / 10; 
            }
        }
        System.out.println("After reversing, we get : "+reverseNumber);
        sc.close();
    }
}

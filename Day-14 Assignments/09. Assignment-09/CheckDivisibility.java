// 9.    Write a Java program to input a number and check whether it is divisible by both 5 and 10 using conditional statements.

import java.util.Scanner;

public class CheckDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to ckeck wheather it is divisible by both 5 and 10 : ");
        int num = sc.nextInt();

        if(num % 5 == 0 && num % 10 == 0){
            System.out.println(+num+ " is divisible by both 5 and 10.");
        }else{
            System.out.println(+num+ " is not divisible by both 5 and 10.");
    }
    }
}

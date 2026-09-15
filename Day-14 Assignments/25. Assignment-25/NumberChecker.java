// 25.    Write a Java program to repeatedly accept numbers using do-while and display whether each number is positive, negative, or zero.

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to ckeck , it is positive , negative or zero");

       do {
        System.out.print("Enter num : ");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println(num + " is negative");
        }else if(num > 0){
            System.out.println(num + " is positive");
        }else{
            System.out.println(num +" is zero");
        }
       } while (true);
    }
}

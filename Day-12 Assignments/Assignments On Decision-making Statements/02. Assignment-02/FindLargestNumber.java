// 2. Write a Java program to accept three numbers and find the largest number using nested if-else.

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 3 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("num1 "+num1+ " is the largest number among " +num1 +", " +num2+ ", "+ num3);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("num2 "+num2+ " is the largest number among " +num1 +", " +num2+ ", "+ num3);
        }else{
             System.out.println("num3 "+num3+ " is the largest number among " +num1 +", " +num2+ ", "+ num3);
        }
        sc.close();
    }
}

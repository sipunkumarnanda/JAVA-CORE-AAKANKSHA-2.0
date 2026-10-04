/*
10. Write a Java program to create a `Number` class with methods to check whether a number is even/odd, positive/negative, and prime.
*/

import java.util.Scanner;

public class Number {
    public static boolean checkOddEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static String checkPositiveNegative(int num){
        if(num >= 0){
            return "Positive";
        }else{
            return "Negative";
        }
    }

    public static boolean isPrime(int num){
        if(num <= 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;

        for(int i=3; i <= Math.sqrt(num); i=i+2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void checkNumber(int num){
        System.out.println(num + " is a "+ (checkOddEven(num) ? "Even" : "Odd") + " Number");
        System.out.println(num + " is a "+ checkPositiveNegative(num)+ " Number");
        System.out.println(num + " is a "+ (isPrime(num) ? "Prime" : "Not a Prime") + " Number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        checkNumber(num);
        sc.close();
    }
}

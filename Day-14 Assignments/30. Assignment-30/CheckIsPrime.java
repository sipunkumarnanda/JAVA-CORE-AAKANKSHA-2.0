// 30.    Write a Java program with a method that accepts a number and returns true if the number is prime and false otherwise using the return statement

import java.util.Scanner;

public class CheckIsPrime {
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check it is prime or not : ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
        sc.close();
    }
}

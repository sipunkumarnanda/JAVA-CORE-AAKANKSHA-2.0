/*
16. Write a Java program to create a `Factorial` class with a method that accepts a number and returns its factorial.
*/

import java.util.Scanner;

public class Factorial {
    static long fact = 1;

    public static long calculateFactorial(int num) {
        if (num == 0)
            return fact;
        fact = fact * num;
        return calculateFactorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for which you want to find its factorial : ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " = " + calculateFactorial(num));
        sc.close();
    }
}

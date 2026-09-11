/*
9. Write a Java program to swap two numbers using a third variable and assignment operators.
*/

import java.util.Scanner;

public class SwapTwoVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number a : ");
        int a = sc.nextInt();
        
        System.out.println("Enter second Number b : ");
        int b = sc.nextInt();

        System.out.println("Value of a and b before swapping is a : " +a+ " and b : " +b);

        int c = a ;
        a = b;
        b = c;

        System.out.println("Value of a and b after swapping is a : " +a + " and b : " +b);

        sc.close();
    }
}

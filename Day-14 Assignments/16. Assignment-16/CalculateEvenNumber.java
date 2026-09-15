// 16.    Write a Java program to input n and calculate the sum of all even numbers from 1 to n using a for loop.

import java.util.Scanner;

public class CalculateEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n until which you want to count all even numbers: ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=1; i<= n; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("Sum of all even numbers from 1 to " + n + " is " + sum + ".");
        sc.close();
    }
}

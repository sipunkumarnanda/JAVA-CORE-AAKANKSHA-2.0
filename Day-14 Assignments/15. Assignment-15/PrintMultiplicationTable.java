// 15.    Write a Java program to input a number and print its multiplication table from 1 to 10 using a for loop.

import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number for the multiplication table: ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num+ " X " +i+ " = " + (num*i));
        }
        sc.close();
    }
}

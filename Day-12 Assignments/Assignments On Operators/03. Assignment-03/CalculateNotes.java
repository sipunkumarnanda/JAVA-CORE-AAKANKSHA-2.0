/*
3. Write a Java program to accept an amount and calculate the number of ₹500, ₹200, ₹100, ₹50, ₹20, ₹10, ₹5, ₹2 , and ₹1 notes required to represent the amount.
*/

import java.util.Scanner;

public class CalculateNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int amount = sc.nextInt();

        if (amount >= 500) {
            int numberOfFiveHundredNotes = amount / 500;
            System.out.println(500 + " X " + numberOfFiveHundredNotes + " = " + (500 * numberOfFiveHundredNotes));
            amount = amount % 500;
        }

        if (amount >= 200) {
            int numberOfTwoHundredNotes = amount / 200;
            System.out.println(200 + " X " + numberOfTwoHundredNotes + " = " + (200 * numberOfTwoHundredNotes));
            amount = amount % 200;
        }

        if (amount >= 100) {
            int numberOfOneHundredNotes = amount / 100;
            System.out.println(100 + " X " + numberOfOneHundredNotes + " = " + (100 * numberOfOneHundredNotes));
            amount = amount % 100;
        }

        if (amount >= 50) {
            int numberOfFiftyRupeeNotes = amount / 50;
            System.out.println(50 + " X " + numberOfFiftyRupeeNotes + " = " + (50 * numberOfFiftyRupeeNotes));
            amount = amount % 50;
        }

        if (amount >= 20) {
            int numberofTwentyRupeeNotes = amount / 20;
            System.out.println(20 + " X " + numberofTwentyRupeeNotes + " = " + (20 * numberofTwentyRupeeNotes));
            amount = amount % 20;
        }

        if (amount >= 10) {
            int numberofTenRupeeNotes = amount / 10;
            System.out.println(10 + " X " + numberofTenRupeeNotes + " = " + (10 * numberofTenRupeeNotes));
            amount = amount % 10;
        }

        if (amount >= 5) {
            int numberofFiveRupeeNotes = amount / 5;
            System.out.println(5 + " X " + numberofFiveRupeeNotes + " = " + (5 * numberofFiveRupeeNotes));
            amount = amount % 5;
        }

        if (amount >= 2) {
            int numberofTwoRupeeCoins = amount / 2;
            System.out.println(2 + " X " + numberofTwoRupeeCoins + " = " + (2 * numberofTwoRupeeCoins));
            amount = amount % 2;
        }

        if (amount >= 1) {
            int numberofOneRupeeCoins = amount / 1;
            System.out.println(1 + " X " + numberofOneRupeeCoins + " = " + (1 * numberofOneRupeeCoins));
        }

        sc.close();
    }
}

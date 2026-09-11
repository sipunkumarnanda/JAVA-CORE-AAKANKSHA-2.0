/*
10. Write a Java program to accept a person's age and income and determine the applicable loan eligibility category using an else-if ladder.
*/

import java.util.Scanner;

public class LoanEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age of the person : ");
        int age = sc.nextInt();

        System.out.println("Enter the Annual Income the person : ");
        double salary = sc.nextDouble();

        if (age < 22) {
            System.out.println("Category : Not Eligible for loan");
        } else if (salary < 250000) {
            System.out.println("Category : Not Eligible for loan");
        } else if ((salary <= 500000)) {
            System.out.println("Category : Basic Loan Eligibility");
        } else {
            System.out.println("Category : High Loan Eligibility");
        }
        sc.close();
    }
}

/*
4. Write a Java program to accept the basic salary, HRA percentage, and DA percentage of an employee and calculate the gross salary using arithmetic and assignment operators.
*/

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the basics salary of an employee : ");
        double basicSalary = sc.nextDouble();

        System.out.println("Enter HRA percantage of the employee : ");
        double hra = sc.nextDouble();

        System.out.println("Enter the DA percantage of the employee : ");
        double da = sc.nextDouble();

        double grossSalary = basicSalary + (hra/100*basicSalary) + (da/100*basicSalary);

        System.out.println("Gross Salary of the employee is : " +grossSalary);

        sc.close();
    }
}

/*
9. Write a Java program to create an `Employee` class with a method to calculate gross salary using basic salary, HRA, and DA.
*/

import java.util.Scanner;

public class Employee {

    public static void calculateGrossSalary(double basicSalary){

        double hra = basicSalary * 20 / 100;
        double da = basicSalary * 10 / 100;

        double grossSalary = basicSalary + hra + da;

        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("Gross Salary is : " + grossSalary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic Slaray : ");
        double basicSalary = sc.nextDouble();

        calculateGrossSalary(basicSalary);
        sc.close();
    }
}
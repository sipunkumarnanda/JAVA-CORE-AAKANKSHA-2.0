/*
3. Write a Java program to create a `Rectangle` class to calculate the area of a rectangle using a method.
*/

import java.util.Scanner;

public class Rectangle {
    public static double calculateAreaOfRectangle(double length, double breadth){
        return length * breadth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length : ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth : ");
        double breadth = sc.nextDouble();

        System.out.println("Area of rectangle is : " + calculateAreaOfRectangle(length, breadth));
        sc.close();
    }
}

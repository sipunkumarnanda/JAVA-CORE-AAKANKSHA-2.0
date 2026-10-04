/*
4. Write a Java program to create a `Circle` class to calculate the area and circumference of a circle.
*/

import java.util.Scanner;

public class Circle {

    public static double calculateAreaOfCircle(double radius){
        return Math.PI * radius * radius;
    }

    public static double calculateCircumferenceOfCircle(double radius){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius of an circle : ");
        double radius = sc.nextDouble();

        System.out.println("Area of the circle is : " +calculateAreaOfCircle(radius));
        System.out.println("Circumference of the circle is : " +calculateCircumferenceOfCircle(radius));
        sc.close();
    }
}

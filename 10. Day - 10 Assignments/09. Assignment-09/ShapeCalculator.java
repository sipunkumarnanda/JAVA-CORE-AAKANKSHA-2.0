/*
9. Write a Java program to declare variables for length and breadth of 
a rectangle using double data type. Calculate and display its area and perimeter.
*/

public class ShapeCalculator {
    public static void main(String[] args) {
        double length = 12.08;
        double breadth = 5.12;
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area of rectangle is " +area);
        System.out.println("Perimeter of rectangle is " +perimeter);
    }
}

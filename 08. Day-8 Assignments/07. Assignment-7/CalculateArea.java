/* Q7. Write a Java program to create a method named `calculateArea()` 
that accepts `length` and `breadth` as parameters. Calculate the area of the 
rectangle using a local variable and display the result.
*/

public class CalculateArea {
    public static void calculateArea(double length, double breadth){
        double area = length * breadth;
        System.out.println("Area of Rectangle is : " +area);
    }

    public static void main(String[] args) {
        calculateArea(10.5, 20);
    }
}

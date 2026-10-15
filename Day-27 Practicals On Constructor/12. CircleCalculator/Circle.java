
/*
12\. Create a `Circle` class with radius. Initialize the radius using a constructor and create methods to calculate area and circumference.
*/

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public void displayDetails() {
        System.out.println("Radius : " + this.radius);
        System.out.printf("Area : %.2f\n", calculateArea());
        System.out.printf("Circumference : %.2f\n", calculateCircumference());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        c1.displayDetails();
    }
}

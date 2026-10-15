/*
3. Create a `Rectangle` class with length and breadth.
Write separate methods to calculate the area and perimeter.
*/

public class Rectangle {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateAreaOfRectangle(){
        System.out.println("Area of rectangle is : " + (this.length * this.breadth));
    }

    public void calculatePerimeterOfRectangle(){
        System.out.println("Perimeter of rectangle is : " + (2 * (this.length + this.breadth)) + "\n");
    }
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12.00,10.00);
        r1.calculateAreaOfRectangle();
        r1.calculatePerimeterOfRectangle();

        Rectangle r2 = new Rectangle(15.00,20.00);
        r2.calculateAreaOfRectangle();
        r2.calculatePerimeterOfRectangle();
    }
}

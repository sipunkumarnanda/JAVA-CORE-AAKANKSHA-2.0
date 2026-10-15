// 5\. Create a `Calculator` class with two numbers and separate methods for addition, subtraction, multiplication, and division.

public class Calculator {
    int num1;
    int num2;

    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void sum() {
        System.out.println(this.num1 + " + " + this.num2 + " = " + (this.num1 + this.num2));
    }

    public void subtract() {
        System.out.println(this.num1 + " - " + this.num2 + " = " + (this.num1 - this.num2));
    }

    public void product() {
        System.out.println(this.num1 + " * " + this.num2 + " = " + (this.num1 * this.num2));
    }

    public void divison() {
        System.out.println(this.num1 + " / " + this.num2 + " = " + (double) (this.num1 / this.num2));
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator(20, 10);
        c1.sum();
        c1.subtract();
        c1.product();
        c1.divison();
    }
}

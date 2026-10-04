/*
15. Write a Java program to create a `Calculator` class implementing method overloading for addition of two integers, three integers, and two double values.
*/

public class Calculator {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {

        System.out.println("10 + 20 = " + sum(10, 20));
        System.out.println("10 + 20 + 30 = " + sum(10, 20, 30));
    }
}
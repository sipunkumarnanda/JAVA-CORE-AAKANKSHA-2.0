/*
3. Write a Java program to declare two int variables, store two numbers in them,
 and display their sum, difference, multiplication, and division.
*/

public class ArithmeticOperations {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        int sumResult = num1 + num2;
        int differenceResult = num1 - num2;
        int productResult = num1 * num2;
        int divisionResult = num1 / num2 ;

        System.out.println(num1 +" + "+ num2 +" = "+ sumResult);
        System.out.println(num1 +" - "+ num2 +" = "+ differenceResult);
        System.out.println(num1 +" * "+ num2 +" = "+ productResult);
        System.out.println(num1 +" ÷ "+ num2 +" = "+ divisionResult);
    }
}

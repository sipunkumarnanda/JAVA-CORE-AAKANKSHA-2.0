/*
10. Write a Java program to declare variables of byte, short, int, long, float, double, char, 
and boolean data types, assign suitable values, and display the value of each variable.
*/

public class DataTypes {
    public static void main(String[] args) {
        byte num1 = 123;
        short num2 = 12345;
        int num3 = 123456789;
        long num4 = 9876543212345L;
        float num5 = 123.123456f;
        double num6 = 12345.123456789;
        char ch = '@';
        boolean bool = true;

        System.out.println("num1's data type is byte and it's value is : " +num1);
        System.out.println("num2's data type is short and it's value is : " +num2);
        System.out.println("num3's data type is int and it's value is : " +num3);
        System.out.println("num4's data type is long and it's value is : " +num4);
        System.out.println("num5's data type is float and it's value is : " +num5);
        System.out.println("num6's data type is double and it's value is : " +num6);
        System.out.println("ch's data type is char and it's value is : " +ch);
        System.out.println("bool's data type is boolean and it's value is : " +bool);
    }
}

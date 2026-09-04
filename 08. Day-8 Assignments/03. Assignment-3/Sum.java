/* Q3. Write a Java program to declare two local variables inside a method. 
Store two numbers in the variables, calculate their sum using another local variable, 
and display the result. */

public class Sum {
    public static void sum(){
            int a = 10;
            int b = 20;
            int sum = a + b;
            System.out.println("Sum of "+a+" and "+b+" is " + sum);
        }
    public static void main(String[] args) {
        sum();
    }
}

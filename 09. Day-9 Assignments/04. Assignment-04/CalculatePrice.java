/*
4. Write a Java program to declare a double variable for the price of a 
product and an int variable for quantity. Calculate and display the total price.
*/

public class CalculatePrice {
    public static void main(String[] args) {
        double price = 1500.12;
        int quantity = 15;
        double totaPrice = price * quantity;
        System.out.println("Total price : " + totaPrice);
    }
}

/*
12. Write a Java program to create a `Product` class with methods to calculate discount and final selling price.
*/

import java.util.Scanner;

public class Product {
    public static  double calculateFinalPriceAfterDiscount(double price, int discount){
        return price - ((discount/100.00) * price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter price of product : ");
        double productPrice = sc.nextDouble();
        System.out.println("Enter discount in percentage : ");
        int discount = sc.nextInt();

        double finalPrice = calculateFinalPriceAfterDiscount(productPrice, discount);
        System.out.println("Final price of product is : " + finalPrice);
        sc.close();
    }
}

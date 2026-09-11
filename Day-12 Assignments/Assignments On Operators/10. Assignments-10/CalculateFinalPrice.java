/*
10. Write a Java program to calculate the final amount of a product after applying a given discount percentage and adding GST percentage using arithmetic and assignment operators.
*/

import java.util.Scanner;

public class CalculateFinalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Prodct Amout : ");
        int productAmout = sc.nextInt();
        System.out.println("Enter the discount in percentage : ");
        int discount = sc.nextInt();

        double afterDiscountPrice = productAmout - ((discount/100.00)*productAmout);
        double gst = 18/100.00 * afterDiscountPrice;
        double finalAmount = afterDiscountPrice + gst;

        System.out.println("Final amount of product is after adding gst : " +finalAmount);

        sc.close();
    }
}

/*
19. Write a Java program to create a `ShoppingCart` class with methods to add product prices, calculate the total bill, and apply a discount.
*/

public class ShoppingCart {
    private String productName;
    private double productPrice;

    ShoppingCart(String productName, double productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName(){
        return this.productName;
    }
    public double getProductPrice(){
        return this.productPrice;
    }

    public double calculateBill(int discount, int quantity){
        double total = this.productPrice * quantity;
        double finalPrice = total - (discount/100.00) * total;
        return finalPrice;
    }

    public static void main(String[] args) {
        ShoppingCart c1 = new ShoppingCart("Samsung S25", 100000);
        int discount = 20;
        int quantity = 2;
        

        System.out.println("----------------Cart Details----------------");
        System.out.println("Product Name : " + c1.getProductName());
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Price : " + c1.getProductPrice() +" X "+ quantity +" = " + c1.getProductPrice() * quantity);
        System.out.println("Discount : " + discount + "%");
        System.out.println("Final Price : " + c1.calculateBill(discount, quantity));
    }
}


/*
19\. Create a `ShoppingCart` class with product name, price, and quantity. Initialize the product 
details using a constructor and create methods to calculate the total price, apply a discount, and display the final bill.
*/


public class ShoppingCart {
    String productName;
    double price;
    int quantity;

    ShoppingCart(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return this.price * this.quantity;
    }

    public double applyDiscount(double discountPercentage) {
        double totalPrice = calculateTotalPrice();

        if (discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Invalid discount percentage");
            return totalPrice;
        }

        double discountAmount = (totalPrice * discountPercentage) / 100;
        return totalPrice - discountAmount;
    }

    public void displayBill(double discountPercentage) {
        double totalPrice = calculateTotalPrice();
        double finalPrice = applyDiscount(discountPercentage);

        System.out.println("Product Name : " + this.productName);
        System.out.printf("Price : Rs. %.2f\n", this.price);
        System.out.println("Quantity : " + this.quantity);
        System.out.printf("Total Price : Rs. %.2f\n", totalPrice);
        System.out.println("Discount : " + discountPercentage + "%");
        System.out.printf("Final Bill : Rs. %.2f\n", finalPrice);
    }

    public static void main(String[] args) {
        ShoppingCart s1 = new ShoppingCart("Laptop", 45000, 2);
        s1.displayBill(10);
    }
}

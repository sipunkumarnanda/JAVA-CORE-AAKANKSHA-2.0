

/*
11\. Create a `Product` class with product name, price, and quantity. Initialize the 
values using a constructor and calculate the total bill using a method.
*/

public class Product {
    String productName;
    double price;
    int quantity;

    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotalBill() {
        return this.price * this.quantity;
    }

    public void displayDetails() {
        System.out.println("Product Name : " + this.productName);
        System.out.println("Price : " + this.price);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Total Bill : " + calculateTotalBill());
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 45000, 2);
        p1.displayDetails();
    }
}

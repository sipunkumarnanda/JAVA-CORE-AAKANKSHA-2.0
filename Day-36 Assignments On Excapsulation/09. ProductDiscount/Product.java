
/*
9\. Create a `Product` class with discount logic (0-50%).
*/

public class Product {
    private String productName;
    private double price;
    private double discount;

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        if (discount >= 0 && discount <= 50) {
            this.discount = discount;
        } else {
            System.out.println("Invalid discount, discount must be between 0 to 50%");
        }
    }

    public double calculateFinalPrice() {
        return this.price - (this.price * this.discount) / 100;
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setProductName("Headphone");
        p1.setPrice(2000);

        p1.setDiscount(70);
        p1.setDiscount(20);

        System.out.println("Product Name : " + p1.getProductName());
        System.out.println("Price : " + p1.getPrice());
        System.out.println("Discount : " + p1.getDiscount() + "%");
        System.out.println("Final Price : " + p1.calculateFinalPrice());
    }
}

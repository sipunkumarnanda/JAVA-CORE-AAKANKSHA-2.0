/*
7\. Create a `Mobile` class with brand, model, and price. Create methods to display mobile details and check whether the price is above ₹20,000.
*/

public class Mobile {
    String brand;
    String model;
    double price;

    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);
        System.out.println("Price : " + this.price);
    }

    public void checkPrice() {
        if (this.price > 20000) {
            System.out.println("Mobile price is above 20000");
        } else {
            System.out.println("Mobile price is bellow 20000");
        }
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", "S 25", 800000);
        m1.displayDetails();
        m1.checkPrice();

        Mobile m2 = new Mobile("Redmi", "Note 1", 8000);
        m2.displayDetails();
        m2.checkPrice();
    }
}

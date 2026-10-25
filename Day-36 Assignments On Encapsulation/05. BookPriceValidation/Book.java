
/*
5\. Create a `Book` class with price validation (>0)
*/

public class Book {
    private String title;
    private double price;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price, price must be greater than 0");
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setTitle("Java Programming");

        b1.setPrice(-100);
        b1.setPrice(450);

        System.out.println("Title : " + b1.getTitle());
        System.out.println("Price : " + b1.getPrice());
    }
}

/*
4. Create a `Book` class with title, author, and price. Use a method to display book information.
*/
public class Book {
    private String title;
    private String author;
    private double price;
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookDetails(){
        System.out.println("Book Name : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Price : " + this.price);
    }
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", 500);
        b1.displayBookDetails();
    }
}

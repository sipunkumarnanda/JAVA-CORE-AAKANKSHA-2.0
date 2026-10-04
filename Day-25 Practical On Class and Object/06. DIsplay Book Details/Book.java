/*
6. Write a Java program to create a `Book` class to store book details and display them using methods.
*/

public class Book {
    String bookName;
    String authorName;
    double price;
    String publisher;

    public void setBookDetails(String bookName, String authorName, double price, String publisher){
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
        this.publisher = publisher;
    }

    public void printBookDetails(){
        System.out.println("Book Name : " + this.bookName);
        System.out.println("Author Name : " + this.authorName);
        System.out.println("Publisher Name : "+ this.publisher);
        System.out.println("Price : " + this.price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setBookDetails("IKIGAI", "Hector Gargia", 300, "Penguin Books");
        b1.printBookDetails();
    }
}

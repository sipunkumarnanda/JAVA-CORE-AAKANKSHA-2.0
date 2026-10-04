/*
20. Write a Java program to create a `Library` class with methods to issue a book, return a book, and display book availability.
*/

public class Library {
    private String bookName;
    private String authorName;
    private int stock;

    Library(String bookName, String authorName, int stock){
        this.bookName = bookName;
        this.authorName = authorName;
        this.stock = stock;
    }

    public void issueBook(){
        if(this.stock > 0){
            this.stock -= 1;
        System.out.println(this.bookName + " issued to a person successfully");
        }else{
            System.out.println(this.bookName + " is out of stock");
        }
    }

    public void returnBook(){
        if(this.stock <= 10){
            this.stock += 1;
            System.out.println(this.bookName + " is accepted to library successfully");
        }else{
            System.out.println("Invalid return");
        }
    }

    public void displayBookAvailability(){
        if(this.stock > 0){
            System.out.println("Stock : " + this.stock);
        }else{
            System.out.println(this.bookName + " is out of stock");
        }
    }
    public static void main(String[] args) {
        Library l1 = new Library("DSA In Java", "XXX", 10);
        l1.issueBook();
        l1.displayBookAvailability();

        l1.issueBook();
        l1.displayBookAvailability();

        l1.issueBook();
        l1.displayBookAvailability();

        l1.returnBook();
        l1.displayBookAvailability();
    }
}

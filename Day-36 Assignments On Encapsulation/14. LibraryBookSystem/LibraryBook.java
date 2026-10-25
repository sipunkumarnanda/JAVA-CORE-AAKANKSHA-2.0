
/*
14\. Create a `LibraryBook` system (issue/return book with encapsulation).
*/

public class LibraryBook {
    private int bookId;
    private String title;
    private String issuedTo;
    private boolean isAvailable;

    LibraryBook(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isAvailable = true;
    }

    public int getBookId() {
        return this.bookId;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void issueBook(String studentName) {
        if (this.isAvailable) {
            this.isAvailable = false;
            this.issuedTo = studentName;
            System.out.println(this.title + " issued to " + studentName);
        } else {
            System.out.println(this.title + " is already issued to " + this.issuedTo);
        }
    }

    public void returnBook() {
        if (!this.isAvailable) {
            System.out.println(this.title + " returned by " + this.issuedTo);
            this.isAvailable = true;
            this.issuedTo = null; 
        } else {
            System.out.println(this.title + " is already available in library");
        }
    }

    public void displayStatus() {
        System.out.println("Book ID : " + this.bookId);
        System.out.println("Title : " + this.title);
        System.out.println("Status : " + (this.isAvailable ? "Available" : "Issued to " + this.issuedTo));
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook(101, "DSA In Java");
        b1.displayStatus();

        System.out.println();

        b1.issueBook("Alex");
        b1.issueBook("John");
        b1.displayStatus();

        System.out.println();

        b1.returnBook();
        b1.returnBook();
        b1.displayStatus();
    }
}

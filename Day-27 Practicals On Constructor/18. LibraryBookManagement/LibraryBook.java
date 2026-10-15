
/*
18\. Create a `LibraryBook` class with book ID, title, and availability status. 
Initialize the book details using a constructor and create methods to issue a book, 
return a book, and display its current status.
*/

public class LibraryBook {
    int bookId;
    String title;
    boolean isAvailable;

    LibraryBook(int bookId, String title, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public void issueBook() {
        if (this.isAvailable) {
            this.isAvailable = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    public void returnBook() {
        if (!this.isAvailable) {
            this.isAvailable = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }

    public void displayStatus() {
        System.out.println("Book ID : " + this.bookId);
        System.out.println("Title : " + this.title);
        System.out.println("Status : " +
                (this.isAvailable ? "Available" : "Issued"));
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook(101, "Java Programming", true);

        b1.displayStatus();

        System.out.println();

        b1.issueBook();
        b1.displayStatus();

        System.out.println();

        b1.returnBook();
        b1.displayStatus();
    }
}

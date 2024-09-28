package Day6;

import java.util.ArrayList;

class Book {

    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Getters and setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    // Override toString() method to display book details
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
public class Day6_Book {

    public static void main(String[] args) {
        // Create an ArrayList of type Book
        ArrayList<Book> bookList = new ArrayList<>();

        // Create book objects and add them to the ArrayList
        bookList.add(new Book(1, "To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book(2, "The Great Gatsby", "F. Scott Fitzgerald"));
        bookList.add(new Book(3, "1984", "George Orwell"));

        // Display all book details
        System.out.println("Book List:");
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }
}
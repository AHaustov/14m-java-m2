package lesson02.hw02anton;

import java.sql.SQLOutput;

public class Book {
    String title;
    int year;
    String author;

    void displayInfo() {
        System.out.println("The Book " + title + " was written till " + year + " by " + author);
    }

    public Book(String bookTitle, int bookYear, String bookAuthor) {
        title = bookTitle;
        year = bookYear;
        author = bookAuthor;
    }
}

class BookHW {
    public static void main(String[] args) {
        Book warAndPeace = new Book("War and Peace", 1868, "Leo Tolstoi");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "Jane Austin");
        Book inferno = new Book("Divina Commedia", 1321, "Dante Alighieri");
        Book effectiveJava= new Book("Effective Java",2001,"Joshua Bloch");
        warAndPeace.displayInfo();
    }
}
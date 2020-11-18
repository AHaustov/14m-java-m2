package homework_11_anton.books.dao;

import homework_11_anton.books.data.Book;
import homework_11_anton.books.data.Cover;
import homework_11_anton.books.data.Genre;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public boolean addBook(Book... book) {
        int temp = size;
        int temp2 = book.length;
        for (int i = temp; i < temp + book.length; i++) {
            if (size < books.length) {
                books[i] = book[i - temp];
                size++;
                temp2--;
            }
            if (i == temp + book.length - 1) {
                return true;
            }
        }
        System.out.println("Problem: The last " + temp2 + " books couldn't be added.");
        return false;
    }

    public boolean deleteBookFromArray(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(book)) {
                books[i] = books[size - 1];
                books[size - 1] = null;
                // теоретически работает и без неё но с интересным эффектом
                size--;
                return true;
            }
        }
        return false;
    }


    public int binarySearchBooksDate(int dateOfPublish) {
        int bookPosition = -1;
        int lowIndex = 0;
        int highIndex = books.length - 1;
        while (lowIndex <= highIndex) {
            int middleIndex = (highIndex + lowIndex) / 2;
            if (dateOfPublish == books[middleIndex].getDateOfIssue()) {
                bookPosition = middleIndex;
                break;
            } else if (dateOfPublish < books[middleIndex].getDateOfIssue()) {
                highIndex = middleIndex - 1;
            } else if (dateOfPublish > books[middleIndex].getDateOfIssue()) {
                lowIndex = middleIndex + 1;
            }
        }
        return bookPosition;
    }

    public void displayByGenre(Genre genre) {
        for (int i = 0; i < size; i++) {
            if (books[i].getGenre().equals(genre)) {
                System.out.println(books[i]);
            }
        }
    }

    public void displayByCover(Cover cover) {
        for (int i = 0; i < size; i++) {
            if (books[i].getCover().equals(cover)) {
                System.out.println(books[i]);
            }
        }
    }

    public void displayByAuthor(String author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().toLowerCase().contains(author.toLowerCase())) {
                System.out.println(books[i]);
            }
        }
    }

}

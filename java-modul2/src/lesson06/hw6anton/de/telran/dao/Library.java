package lesson06.hw6anton.de.telran.dao;

import lesson06.hw6anton.de.telran.data.Book;

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

    public boolean addBook(Book kniga) {
        if (size < books.length) {
            books[size] = kniga;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteBookFromArray(Book kniga) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(kniga)) {
                books[i] = books[size - 1];
                books[size - 1] = null;
                // теоретически работает и без неё но с интересным эффектом
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayDeleteBook() {
        System.out.println(books[size - 1]);
        System.out.println(books[size]);
        System.out.println(books[size + 1]);
    }

    public void displayAllArray() {
        for (Book element : books) {
            System.out.println(element);
        }
    }

    public int binarySearch(String author) {
        int indexMin = 0;
        int indexMax = size - 1;
        int index = -1;
        boolean find = false;
        while (!find) {
            if (indexMax - indexMin <= 1) {
                find = true;
                if (books[indexMax].getAuthor().equalsIgnoreCase(author)) {
                    index = indexMax;
                } else if (books[indexMin].getAuthor().equalsIgnoreCase(author)) {
                    index = indexMin;
                } else index = -1;
            } else {
                index = (indexMax + indexMin) / 2;
                if (books[index].getAuthor().equalsIgnoreCase(author)) {
                    find = true;
                } else {
                    if (books[index].getAuthor().compareToIgnoreCase(author) > 0) {
                        indexMax = index;
                    } else indexMin = index;
                }
            }
        }
        return index;
    }
}

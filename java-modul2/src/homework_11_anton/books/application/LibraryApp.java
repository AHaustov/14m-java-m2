package homework_11_anton.books.application;

import homework_11_anton.books.dao.Library;
import homework_11_anton.books.data.Book;
import homework_11_anton.books.data.Cover;
import homework_11_anton.books.data.Genre;

public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book(
                "Harry Potter and the Philosopher's Stone",
                "J.K. Rowling",
                335, 1997,
                Genre.FANTASY, Cover.HARD);
        Book book2 = new Book(
                "Winnie the Pooh",
                "Alex Milne", 256,
                1966, Genre.COMIC, Cover.SOFT);
        Book book3 = new Book(
                "Sherlock Holmes",
                "Arthur Conan Doyle", 388, 1892
                , Genre.THRILLER, Cover.POCKET);
        Book book4 = new Book(
                "Little Prince",
                "Antoine de Saint-Exupery", 200, 1943,
                Genre.NOVEL, Cover.SOFT);
        Book book5 = new Book(
                "Harry Potter and the Chamber of Secrets",
                "J.K. Rowling",
                352, 1998,
                Genre.FANTASY, Cover.HARD);
        Book book6 = new Book(
                "Harry Potter and the Prisoner of Askaban",
                "J.K. Rowling",
                448, 1999,
                Genre.FANTASY, Cover.HARD);
        Book book7 = new Book(
                "Harry Potter and the Goblet of Fire",
                "J.K. Rowling",
                435, 2000,
                Genre.FANTASY, Cover.HARD);
        Book book8 = new Book(
                "Harry Potter and the Order of the Phoenix",
                "J.K. Rowling",
                766, 2003,
                Genre.FANTASY, Cover.HARD);
        Book book9 = new Book(
                "Harry Potter and the Half-Blood Prince",
                "J.K. Rowling",
                656, 2005,
                Genre.FANTASY, Cover.HARD);
        Book book10 = new Book(
                "Harry Potter and the Deathly Hallows",
                "J.K. Rowling",
                759, 2007,
                Genre.FANTASY, Cover.HARD);
        Book book11 = new Book("The Last Wish", "Andrzej Sapkowski ",
                288, 2007,
                Genre.SHORT_STORIES, Cover.SOFT);
        Book book12 = new Book("Sword of Destiny", "Andrzej Sapkowski ",
                384, 2015,
                Genre.SHORT_STORIES, Cover.SOFT);
        Book book13 = new Book("Blood of Elves", "Andrzej Sapkowski ",
                320, 2008,
                Genre.FANTASY, Cover.SOFT);
        Book book14 = new Book("Time of Contempt", "Andrzej Sapkowski ",
                331, 2013,
                Genre.FANTASY, Cover.SOFT);
        Book book15 = new Book("Baptism of Fire", "Andrzej Sapkowski ",
                343, 2014,
                Genre.FANTASY, Cover.SOFT);
        Book book16 = new Book("The Tower of the Swallow", "Andrzej Sapkowski ",
                436, 2016,
                Genre.FANTASY, Cover.SOFT);
        Book book17 = new Book("The Lady of the Lake", "Andrzej Sapkowski ",
                531, 2017,
                Genre.FANTASY, Cover.SOFT);
        Book book18 = new Book("Season of Storms", "Andrzej Sapkowski ",
                384, 2018,
                Genre.NOVEL, Cover.SOFT);


        Library myLib = new Library(25);

        myLib.addBook(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11,
                book12, book13, book14, book15, book16, book17, book18);

        myLib.displayByAuthor("row");

    }
}

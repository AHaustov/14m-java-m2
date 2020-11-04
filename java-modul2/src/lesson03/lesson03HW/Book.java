package lesson03.lesson03HW;

public class Book {
    private String title;
    private int year;
    private String author;
    private String publisher;
    private int edition;
    private boolean filmExists;
    private String genre;
    private String language;
    private int pages;
    private int bookmark;
    private double price;
    private int stock;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return this.stock;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getEdition() {
        return this.edition;
    }

    public void setFilmExists(boolean filmExists) {
        this.filmExists = filmExists;
    }

    public boolean getFilmExists() {
        return this.filmExists;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return this.pages;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public double getPrice() {
        return this.price;
    }

    public void setBookmark(int page) {
        this.bookmark = page;
    }

    public int getBookmark() {
        return this.bookmark;
    }

    public void read(int pagesToRead) {
        this.bookmark += pagesToRead;
    }

    public void displayInfo() {
        System.out.println("The Book " + this.title + " was written till " + this.year + " by " + this.author);
    }

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public Book(String title, int year, int edition, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.edition = edition;
    }

    public Book(String title, String publisher, double price) {
        this.title = title;
        this.publisher = publisher;
        this.price = price;
    }

    public Book(String title, int edition, double price, String language) {
        this.title = title;
        this.edition = edition;
        this.price = price;
        this.language = language;
    }

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public Book(String title, boolean filmExists) {
        this.title = title;
        this.filmExists = filmExists;
    }

    public Book(String title, int year, int edition, int pages) {
        this.title = title;
        this.year = year;
        this.edition = edition;
        this.pages = pages;
    }

    public Book(String title, int year, String author, String publisher, int edition, boolean filmExists, String genre, String language, int pages, double price, int stock) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.edition = edition;
        this.publisher = publisher;
        this.price = price;
        this.genre = genre;
        this.language = language;
        this.pages = pages;
        this.filmExists = filmExists;
        this.stock = stock;
    }

    public Book(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }
}

class TestBook {
      public static void main(String[] args) {
        Book warAndPeace = new Book("War and Peace", 1868, "Leo Tolstoi");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "Jane Austin");
        Book inferno = new Book("Divina Commedia", 1321, "Dante Alighieri");
        Book effectiveJava = new Book("Effective Java", 2001, "Joshua Bloch");
        Book harryPotter1 = new Book("Harry Potter und der Stein der Weisen", 1998, "Joanne K. Rowling", "Carlsen Verlag", 1, true, "Fantasy", "german", 335, 8.99D, 99);
        Book witcher1 = new Book("Das Erbe der Elfen", "fantasy");
        Book witcher2 = new Book("Die Zeit der Verachtung", 1995, 1, "Andrzej Sapkowski");
        Book tomSaw = new Book("The Adventures of Tom Sawyer", 1876, "Mark Twain");
        Book uniNuss = new Book("Universum in der Nussschale", 2001, "Stephen Hawking");
        Book verwandlung = new Book("Die Verwandlung", 1912, "Franz Kafka");
        Book greatExpectations = new Book("Great Expectations", 1861);
        Book[] arr = new Book[]{warAndPeace, prideAndPrejudice, inferno, effectiveJava, harryPotter1, witcher1, witcher2, tomSaw, uniNuss, verwandlung, greatExpectations};
        printArr(arr);
    }

    private static void printArr(Book[] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length - 1; ++i) {
            System.out.print(arr[i].getTitle() + ", ");
        }

        System.out.print(arr[arr.length - 1].getTitle() + "]\n");
    }
}

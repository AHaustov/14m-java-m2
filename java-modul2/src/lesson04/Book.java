package lesson04;

public class Book {
    private static int exemplar = 0;
    private String title;
    private String author;
    private String isbn;
    private int page;
    private int year = 2020;

    public static String country = "UdSSR";

    public Book() {
        this("Azbuka", "Маршак", 2020);
        exemplar++;
    }

    public static int getExemplar() {
        return exemplar;
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.page = page;
        this.year = year;
    }

    public Book(String title, String author, String isbn, int page) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.page = page;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", page='" + page + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year=" + year +
                '}';
    }
}

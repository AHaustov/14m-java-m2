package homework_11_anton.books.data;

public class Book {
    private String title;
    private String author;
    private int dateOfIssue;
    private int pages;
    private Genre genre;
    private Cover cover;

    public Book(String title, String author, int pages, int dateOfIssue, Genre genre, Cover cover) {
        this.title = title;
        this.author = author;
        this.dateOfIssue = dateOfIssue;
        this.pages = pages;
        this.genre = genre;
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getDateOfIssue() {
        return dateOfIssue;
    }

    public int getPages() {
        return pages;
    }

    public Genre getGenre() {
        return genre;
    }

    public Cover getCover() {
        return cover;
    }

    @Override
    public String toString() {
        return "\nBook" +
                " '" + title + '\'' +
                " by '" + author + '\'' +
                " from " + dateOfIssue +
                " with " + pages +
                " pages." + "\nGenre: " + genre +
                " Cover is: " + cover;
    }
}

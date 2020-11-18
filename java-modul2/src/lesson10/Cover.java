package lesson10;

public enum Cover {
    HARD("Hart"),
    EBOOK("E-Book"),
    SOFT("Broschüre"),
    POCKET("Taschenbuch");
    private String title;

    Cover(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Cover{" +
                "title='" + title + '\'' +
                '}';
    }
}

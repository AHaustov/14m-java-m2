package lesson03;

public class Movie {
    private String title;
    private int year;
    private String genre;


    public Movie(String title, int year, String genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }


    public String getTitle(){
        return this.title;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

}
// патерны проектирования singleton-одиночка
class TestMovie{
    public static void main(String[] args) {
        Movie bestFilmForEver = new Movie(
                "Мой первый фильм",
                2020,
                "Фантастика");

        System.out.println(bestFilmForEver.getTitle());

        bestFilmForEver.setTitle("Санта-Барбара");

        System.out.println(bestFilmForEver.getTitle());
    }
}

package lesson10.bak;

public class Alcohol {
    private String title;
    private double perCent;
    private double ml;
    private static final double ALCO_COEF=0.008;

    public Alcohol(double perCent, double ml) {
        this.perCent = perCent;
        this.ml = ml;
    }

    public Alcohol(String title, double perCent, double ml) {
        this.title = title;
        this.perCent = perCent;
        this.ml = ml;
    }

    public double getAlcoGram() {
        return ml * perCent * ALCO_COEF;
    }


    @Override
    public String toString() {
        return "Alcohol{" +
                "title='" + title + '\'' +
                ", perCent=" + perCent +
                ", ml=" + ml +
                '}';
    }
}

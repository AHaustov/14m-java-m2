package lesson10.hw.bak_anastasija;

public class Alcohol {
    private String title;
    private double perCent;
    private double ml;
    private static final double ALCO_COEF=0.008;

    public Alcohol(String title, double perCent, double ml) {
        this.title = title;
        this.perCent = perCent;
        this.ml = ml;
    }

    public Alcohol(double perCent, double ml) {
        this.perCent = perCent;
        this.ml = ml;
    }

    public double getAlcoGramm() {
        return ml * perCent * ALCO_COEF;
    }

    public double getPerCent() {
        return perCent;
    }

    public double getMl() {
        return ml;
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

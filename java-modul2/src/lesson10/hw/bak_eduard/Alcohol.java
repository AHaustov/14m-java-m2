package lesson10.hw.bak_eduard;

import java.util.Objects;

/**
 * class Alcohol
 */
public class Alcohol {
    private final String title;
    private final double perCent;
    private final double ml;
    private static final double ALCO_COEF = 0.008;

    public Alcohol(double perCent, double ml) {
        this.title = null;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alcohol)) return false;
        Alcohol alcohol = (Alcohol) o;
        return Double.compare(alcohol.perCent, perCent) == 0 &&
                Double.compare(alcohol.ml, ml) == 0 &&
                Objects.equals(title, alcohol.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, perCent, ml);
    }
}

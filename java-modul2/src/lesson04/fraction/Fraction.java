package lesson04.fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    @Override
    public String toString() {
        return "Fraction(дробь){" +
                "numerator(числитель)=" + numerator +
                ", denominator(знаменатель)=" + denominator +
                '}';
    }
}

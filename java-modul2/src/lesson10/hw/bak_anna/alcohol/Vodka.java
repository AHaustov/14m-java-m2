package lesson10.hw.bak_anna.alcohol;

public class Vodka extends Alcohol {

    public Vodka(double liter) {

        super((int) Math.round(liter * 315.6));
    }
}

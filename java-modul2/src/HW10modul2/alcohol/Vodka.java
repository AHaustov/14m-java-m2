package HW10modul2.alcohol;

public class Vodka extends Alcohol {

    public Vodka(double liter) {

        super((int) Math.round(liter * 315.6));
    }
}

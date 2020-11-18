package lesson10.hw.bak_anna.alcohol;

public class Beer extends Alcohol {

    public Beer(double liters) {

        super((int) Math.round(liters * 40));
    }
}

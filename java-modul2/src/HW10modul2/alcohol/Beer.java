package HW10modul2.alcohol;

public class Beer extends Alcohol {

    public Beer(double liters) {

        super((int) Math.round(liters * 40));
    }
}

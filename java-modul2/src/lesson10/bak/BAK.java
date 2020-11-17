package lesson10.bak;

public class BAK {
    private Person person;
    private Alcohol[] alcoholDrinks;
    private double bloodAlcoholConcentration;

    public BAK(Person person, Alcohol... alcoholDrinks) {
        this.person = person;
        this.alcoholDrinks = alcoholDrinks;
    }
}

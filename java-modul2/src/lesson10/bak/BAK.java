package lesson10.bak;

public class BAK {
    private Person person;
    private Alcohol[] alcoholDrink;
    private double bloodAlcoholConcentration;
    private double permilleInHour = 0.15;
    //elliminationTime = 0,15 permille each Hour

    public void findTimeToDriveForRU() {
        int hourToDrive = 0;
        hourToDrive = (int) Math.floor(bloodAlcoholConcentration / permilleInHour);
        System.out.println(person.getName() + ", you can drive in " + hourToDrive + " hours.");
    }

    public BAK(Person person, Alcohol... alcoholDrink) {
        this.person = person;
        this.alcoholDrink = alcoholDrink;
    }

    public double findPermille() {
        double alcoGramInAll = 0;
        for (Alcohol drink : alcoholDrink) {
            alcoGramInAll += drink.getAlcoGramm();
        }
        bloodAlcoholConcentration =
                alcoGramInAll / (person.getWeight() * person.reduction());

        return bloodAlcoholConcentration;
    }
}

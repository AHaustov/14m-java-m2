package lesson10.hw.bak_nadja;

import Day43.customerProject.Cocktail.Ingredient;

public class BAK {
    private Person person;
    private Alcohol[] alcoholDrinks;
    private double bloodAlcoholConcentration;
    private final double metabolismConstant = 0.15;
    public TimeZone timeZone;

    public BAK(Person person, TimeZone timeZone, Alcohol... alcoholDrinks) {
        this.person = person;
        this.alcoholDrinks = alcoholDrinks;
        setBloodAlcoholConcentration();
        this.timeZone = timeZone;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    private void setBloodAlcoholConcentration() {
        double rez = sumPerCent(alcoholDrinks) /
                (person.getWeight() * distributionFactor());
        rez = (int) (rez * 100);
        this.bloodAlcoholConcentration = rez / 100;
    }

    public double getBloodAlcoholConcentration() {
        return bloodAlcoholConcentration;
    }

    private double sumPerCent(Alcohol... alcoholDrinks) {
        double perCent = 0;

        for (Alcohol element : alcoholDrinks) {
            perCent += element.getAlcoGram();
        }
        return perCent;
    }

    private double distributionFactor() {
        double rFactor = 0.00;
        if (person.getAge() < 4) {
            rFactor = 0.8;//Kleinkinder
        } else if (this.person.getGender() == Gender.MALE) {
            rFactor = 0.7;
        } else if (this.person.getGender() == Gender.FEMALE) {
            rFactor = 0.6;
        } else if (this.person.getGender() == Gender.DIVERSE) {
            rFactor = 0.9; //тут не поеятно кто он и что брать
        }
        return rFactor;
    }

    private double searchGrenzwerte() {
        double grenzwerte = 0;
        switch (timeZone) {
            case BERLIN: {
                grenzwerte = 0.3;
                break;
            }
            case MOSCOW: {
                grenzwerte = 0.2;
                break;
            }
            case MILAN: {
                grenzwerte = 0.5;
                break;
            }
            default: {
                grenzwerte = 0.0;
                break;
            }
        }
        return grenzwerte;
    }

    public double calculatorAlcoholWithdrawalTime() {
        double timeAlcohol;
        timeAlcohol = (getBloodAlcoholConcentration() - searchGrenzwerte()) / 0.15;
        timeAlcohol = (int) (timeAlcohol * 100);
        timeAlcohol = timeAlcohol / 100;
        return timeAlcohol;

    }

    @Override
    public String toString() {
        return "BAK{" +
                "person=" + person +
                ", bloodAlcoholConcentration=" + bloodAlcoholConcentration +
                '}';
    }
}

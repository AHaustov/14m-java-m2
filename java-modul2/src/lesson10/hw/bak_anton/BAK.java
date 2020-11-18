package lesson10.hw.bak_anton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BAK {
    private Person person;
    private Alcohol[] alcoholDrinks;
    private double bloodAlcoholConcentration;

    public BAK(Person person, Alcohol... alcoholDrinks) {
        this.person = person;
        this.alcoholDrinks = alcoholDrinks;
        this.bloodAlcoholConcentration = getWholeAlcoGram() /
                (person.getWeight() * person.getReductionFactor());
        // setBloodAlcoholConcentration();
    }

    private double getWholeAlcoGram() { // динамический
        double sum = 0;
        for (Alcohol alcohol : alcoholDrinks) {
            sum += alcohol.getAlcoGram();
        }
        return sum;
    }

    public double getBAK() {
        return Math.round(bloodAlcoholConcentration * 100) / 100.00;
    }

    public String rdyToDrive(String nation) {
        return person.getName() + " is legally able to drive at " +
                LocalDateTime.now().plusHours(hoursToBeRdy(nation)).format(format) +
                " in '" + nation + "' of local Time.";
    }

    private int hoursToBeRdy(String nation) {
        double reduction;
        double temp = getBAK();
        int count = 0;
        switch (nation) {
            case "de":
                reduction = 0.3;
                break;
            case "by":
                reduction = 0.0;
                break;
            case "ru":
                reduction = 0.356;
                break;
            case "be":
                reduction = 0.5;
                break;
            case "bu":
                reduction = 0.5;
                break;
            default:
                reduction = 0.0;
                break;
        }
        while (reduction < temp) {
            count++;
            temp -= 0.15;
        }
        return count;
    }

    DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");

    @Override
    public String toString() {
        return "The BAC like Widmark for " +
                person.getName() + " is :" +
                getBAK() + "‰";
    }
}
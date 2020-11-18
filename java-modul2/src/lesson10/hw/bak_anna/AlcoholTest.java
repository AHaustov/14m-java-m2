package lesson10.hw.bak_anna;

import lesson10.hw.bak_anna.alcohol.Alcohol;
import lesson10.hw.bak_anna.drivingRule.DrivingRule;
import lesson10.hw.bak_anna.person.Person;

public class AlcoholTest {
    private Alcohol alcohol;
    private Person person;
    private DrivingRule drivingRule;

    public AlcoholTest(Alcohol alcohol, Person person, DrivingRule drivingRule) {
        this.alcohol = alcohol;
        this.person = person;
        this.drivingRule = drivingRule;
    }

    private double getAlcoholPpm() {
        return alcohol.getAmountOfAlcohol() / (person.getMass() * person.getReduction());
    }

    public double getTimeToDrive() {

        double timeLeft = (getAlcoholPpm() - drivingRule.getAllowedPpm()) / 0.15;
        if (timeLeft < 0) return 0;
        else return timeLeft;
    }
}

package HW10modul2;

import HW10modul2.alcohol.Alcohol;
import HW10modul2.drivingRule.DrivingRule;
import HW10modul2.person.Person;

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

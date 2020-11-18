package lesson10.hw.bak_nadja;

import java.time.LocalDate;

public class Starter {
    public static void main(String[] args) {

        Person sasha = new Person("Sasha", 80, 185, Gender.MALE, LocalDate.of(1981, 12, 23));
        Person masha = new Person("Masha", 60, 163, Gender.FEMALE, LocalDate.of(1975, 3, 14));
        Alcohol vodka = new Alcohol("vodka", 40, 100);
        Alcohol beer = new Alcohol("Beer", 5, 500);
        Alcohol wine = new Alcohol("Wine", 11, 200);

        BAK person1 = new BAK(sasha, TimeZone.BERLIN, beer, vodka);
        System.out.println(person1);
        System.out.println("You can get back behind the wheel in " + person1.calculatorAlcoholWithdrawalTime() + " hour");
        BAK person2 = new BAK(masha, TimeZone.MOSCOW, wine);
        System.out.println(person2);
        System.out.println("You can get back behind the wheel in " + person2.calculatorAlcoholWithdrawalTime() + " hour");
    }
}

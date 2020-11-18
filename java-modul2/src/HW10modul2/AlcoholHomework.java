package HW10modul2;

import HW10modul2.alcohol.Beer;
import HW10modul2.alcohol.Vodka;
import HW10modul2.drivingRule.DrivingRuleGermany;
import HW10modul2.drivingRule.DrivingRuleRussia;
import HW10modul2.person.Man;
import HW10modul2.person.Woman;

public class AlcoholHomework {
    public static void main(String[] args) {
        Man mark = new Man(80);
        Woman maria = new Woman(60);
        Beer beer = new Beer(1);
        Vodka vodka = new Vodka(1);
        DrivingRuleRussia russia = new DrivingRuleRussia();
        DrivingRuleGermany germany = new DrivingRuleGermany();

        AlcoholTest markVodkaRussia = new AlcoholTest(vodka, mark, russia);
        AlcoholTest mariaVodkaRussia = new AlcoholTest(vodka, maria, russia);
        AlcoholTest markBeerGermany = new AlcoholTest(beer, mark, germany);
        AlcoholTest mariaBeerGermany = new AlcoholTest(beer, maria, germany);

        System.out.printf("Mark drank a liter of vodka in Russia and is allowed to drive again in %.2f hours.\n", markVodkaRussia.getTimeToDrive());
        System.out.printf("Maria drank a liter of vodka in Russia and is allowed to drive again in %.2f hours.\n", mariaVodkaRussia.getTimeToDrive());
        System.out.printf("Mark drank a liter of beer in Germany and is allowed to drive again in %.2f hours.\n", markBeerGermany.getTimeToDrive());
        System.out.printf("Maria drank a liter of beer in Germany and is allowed to drive again in %.2f hours.\n", mariaBeerGermany.getTimeToDrive());
    }
}

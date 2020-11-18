package lesson10.hw.bak_anna;

import lesson10.hw.bak_anna.alcohol.Beer;
import lesson10.hw.bak_anna.alcohol.Vodka;
import lesson10.hw.bak_anna.drivingRule.DrivingRuleGermany;
import lesson10.hw.bak_anna.drivingRule.DrivingRuleRussia;
import lesson10.hw.bak_anna.person.Man;
import lesson10.hw.bak_anna.person.Woman;

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

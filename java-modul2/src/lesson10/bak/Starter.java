package lesson10.bak;

import java.time.LocalDate;

public class Starter {
    public static void main(String[] args) {
        Person tim = new Person("Tim", 93.4, 187, Gender.MALE, LocalDate.of(1987, 6, 21));
        Person kevin = new Person("Kevin", 105, 170, Gender.MALE, LocalDate.of(2008, 11, 16));
        Person katja = new Person("Katja", 62, 172, Gender.FEMALE, LocalDate.of(1998, 4, 7));
        Alcohol beer = new Alcohol(4.8, 500);
        Alcohol wine = new Alcohol(10.4, 200);
        Alcohol whiskey = new Alcohol(40, 40);

        BAK bak1 = new BAK(tim, beer, beer, beer, whiskey);
        BAK bak2 = new BAK(kevin, beer, wine, whiskey, beer, wine);
        BAK bak3 = new BAK(katja, wine, wine);

        System.out.println(bak3);
        System.out.println(bak2);
        System.out.println(bak1);
        System.out.println(bak1.rdyToDrive("de"));
        System.out.println(bak2.rdyToDrive("by"));
        System.out.println(bak3.rdyToDrive("ru"));
    }


}

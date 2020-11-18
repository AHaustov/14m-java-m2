package lesson10.hw.bak_eduard;

import java.time.LocalDate;

/**
 * class Starter / App
 */
public class App {
    public static Gender male;
    public static Gender female;
    public static Gender diverse;
    public static Alcohol drink01;
    public static Alcohol drink02;
    public static Person person1;

    public static void main(String[] args) {
        male = Gender.MALE;
        female = Gender.FEMALE;
        diverse = Gender.DIVERSE;

        drink01 = new Alcohol("\"соточка\"", 40.0, 100);
        System.out.println(drink01);

        drink02 = new Alcohol("\"пивасик\"", 13.0, 500);
        System.out.println(drink02);

        person1 = new Person("Adam", 95.0, 190.0, male,
                LocalDate.of(1970, 12, 01));
        System.out.println(person1);
    }
}

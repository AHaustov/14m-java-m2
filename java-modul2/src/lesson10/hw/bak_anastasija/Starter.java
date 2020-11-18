package lesson10.hw.bak_anastasija;

public class Starter {
    public static void main(String[] args) {
        Alcohol beer = new Alcohol(5, 330);
        Alcohol wine = new Alcohol(14, 150);
        Alcohol vodka = new Alcohol(40, 50);

        Person pavel = new Person("Pavel", 84, Gender.MALE);
        Person maria = new Person("Maria", 58, Gender.FEMALE);
        Person sofia = new Person("Sofia Mihalna", 115, Gender.FEMALE);

        BAK feast1 = new BAK(pavel, beer, beer, vodka);
        BAK feast2 = new BAK(maria, wine, wine);
        BAK feast3 = new BAK(sofia, vodka, vodka, vodka, vodka, vodka);

        System.out.println(feast1.findPermille() + " permille");
        System.out.println(feast2.findPermille() + " permille");
        System.out.println(feast3.findPermille() + " permille");
        feast1.findTimeToDriveForRU();
        feast2.findTimeToDriveForRU();
        feast3.findTimeToDriveForRU();
    }
}

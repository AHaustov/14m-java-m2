package lesson03;

class TestCat {
    public static void main(String[] args) {
        Cat catchen = new Cat("Тигр");
        Cat siam1 = new Cat(
                "Фараон",
                "2020-11-04",
                "Мальчик",
                "Silver",
                100);

        Address siam1Address = new Address("Berlin", "Kudam");
        siam1Address.houseNumber = 56;
        siam1Address.zip = "00000";

        siam1.address = siam1Address;
        Address adr = new Address("Москва", "Ленина");

        Cat barsik = new Cat("Барсик", new Address("Dresden", "Lenina"));
        Cat puzik = new Cat("Пузик", adr);

    }
}

public class Cat {
    String name; // кличка
    String birthDate; // днюха
    String breed;  // порода
    String color;
    int chipID;
    String gender;
    double weight;
    double height;
    double price;
    boolean passport;
    Address address;
    double bmiIndex;

    //final Long VERSION = 2020_11_04_00_10_07L;  // версионирование, java, убунту, андроид

    Cat(String name) {
    }

    Cat(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    Cat(String name, String breed) {
    }

    Cat(String name, String birthDate, String gender, String color, double price) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.color = color;
        this.price = price;
        this.setBmiIndex();
    }

    Cat(String catName, String catBirthDate, String catGender, String catColor) {
        name = catName;
        birthDate = catBirthDate;
        gender = catGender;
        color = catColor;
    }

    void setBmiIndex() {
        this.bmiIndex = price * price;
    }
}

class Address {
    protected String city;
    private String street;
    int houseNumber; // 8/17
    String zip;

    Address(String city, String street) {

    }
}



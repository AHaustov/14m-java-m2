package lesson03;

class TestCat {
    public static void main(String[] args) {
        Cat catchen = new Cat("Тигр");
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

    Cat(String name) {
    }

    Cat(String name, String breed) {
    }

    Cat(String name, String birthDate, String gender, String color, double price) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.color = color;
        this.price = price;
        this.bmiIndex = price * price; // prosto formula  // плохая практика
    }

    Cat(String catName, String catBirthDate, String catGender, String catColor) {
        name = catName;
        birthDate = catBirthDate;
        gender = catGender;
        color = catColor;
    }
}

class Address {
    String city;
    String street;
    int houseNumber; // 8/17
    String zip;
}



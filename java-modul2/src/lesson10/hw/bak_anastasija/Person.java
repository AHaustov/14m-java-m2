package lesson10.hw.bak_anastasija;

import java.time.LocalDate;

public class Person {
    private String name;
    private double weight; //kg
    private double height; //cm
    private Gender gender;
    private LocalDate birthday;

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }

    public Person(String name, double weight, double height, Gender gender, LocalDate birthday) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Person(String name, double weight, Gender gender) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.birthday = LocalDate.now().minusYears(16);
    }

    public double reduction() {
        double reductionFactor;
        if (gender.getGender() == 1) {
            reductionFactor = 0.7;
        } else {
            reductionFactor = 0.6;
        }
        return reductionFactor;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }
}

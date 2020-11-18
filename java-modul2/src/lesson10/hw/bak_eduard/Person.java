package lesson10.hw.bak_eduard;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person {
    private final String name;
    private final double weight;// kg
    private double height;// cm
    private final Gender gender;
    private LocalDate birthday;

    public int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public Person(String name, double weight, Gender gender) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.birthday = LocalDate.now().minusYears(16);
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Person(String name, double weight, double height, Gender gender, LocalDate birthday) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Double.compare(person.getWeight(), getWeight()) == 0 &&
                Double.compare(person.getHeight(), getHeight()) == 0 &&
                Objects.equals(getName(), person.getName()) &&
                getGender() == person.getGender() &&
                Objects.equals(birthday, person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWeight(), getHeight(), getGender(), birthday);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", gender=" + gender +
                ", age=" + getAge() +
                '}';
    }
}

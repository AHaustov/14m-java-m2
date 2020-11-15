package lesson08.hw08anton;


import java.time.LocalDate;
import java.time.Period;

public class Human {
    private LocalDate birthday;

    public Human() {
    }

    public Human(int day, int month, int year) {
        birthday = LocalDate.of(year, month, day);
    }

    public int getYear() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthday, now);
        return period.getYears();
    }
}

class Test {
    public static void main(String[] args) {
        Human max = new Human(14, 4, 1986);
        System.out.println("This Person is now " + max.getYear() + " years old.");
    }
}

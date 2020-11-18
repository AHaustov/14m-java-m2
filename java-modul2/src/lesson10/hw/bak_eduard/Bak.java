package lesson10.hw.bak_eduard;

import java.util.Arrays;
import java.util.Objects;

/**
 * class Bak
 */
public class Bak {
    private final Person person;
    private final Alcohol[] alcoholDrinks;
    private double bloodAlcoholConcentration;

    public Bak(Person person, Alcohol... alcoholDrinks) {
        this.person = person;
        this.alcoholDrinks = alcoholDrinks;
    }

    public String displayLevel(Double bloodAlcoholConcentration) {
        Double a = bloodAlcoholConcentration;
        String result;

        if (a <= 0.3) {
            result = "Норма, содержание алкоголя в рамках физиологической нормы.";
        } else if (a < 0.5) {
            result = "Установлен факт употребления, признаки опьянения минимальны.";
        } else if (a < 1.5) {
            result = "Легкая степень опьянения.";
        } else if (a < 2.5) {
            result = "Средняя степень опьянения.";
        } else if (a < 3.0) {
            result = "Тяжелая степень опьянения, возможно алкогольное отравление.";
        } else if (a < 6.0) {
            result = "Опасная степень опьянения, высока вероятность отравления.";
        } else if (a < 100) {
            result = "Смертельно опасная концентрация алкоголя, обратитесь помощью.";
        } else {
            result = "Ошибка ввода данных.";
        }
        return result;
    }

    @Override
    public String toString() {
        return "BAK{" +
                "person=" + person +
                ", alcoholDrinks=" + Arrays.toString(alcoholDrinks) +
                ", bloodAlcoholConcentration=" + bloodAlcoholConcentration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bak)) return false;
        Bak bak = (Bak) o;
        return Double.compare(bak.bloodAlcoholConcentration, bloodAlcoholConcentration) == 0 &&
                Objects.equals(person, bak.person) &&
                Arrays.equals(alcoholDrinks, bak.alcoholDrinks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(person, bloodAlcoholConcentration);
        result = 31 * result + Arrays.hashCode(alcoholDrinks);
        return result;
    }
}

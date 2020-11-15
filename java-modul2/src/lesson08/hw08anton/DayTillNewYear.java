package lesson08.hw08anton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayTillNewYear {
    public static void main(String[] args) {
        daysTillNewYear();
    }

    private static void daysTillNewYear() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate newYear = LocalDate.of(now.getYear(), 12, 31);
        int daysTillNewYear = newYear.getDayOfYear() - now.getDayOfYear();
        System.out.println("Today is " + now.format(format) + " and you have to wait "
                + daysTillNewYear + " days till New Year's Eve.");
    }
}

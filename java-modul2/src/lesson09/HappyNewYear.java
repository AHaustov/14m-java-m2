package lesson09;

import java.time.LocalDate;

public class HappyNewYear {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate silvester1 = LocalDate.of(
                today.getYear() + 1, 1, 1
        );
        LocalDate silvester2 = LocalDate.of(
                today.getYear(), 12, 31
        );

        int day1 = silvester1.getDayOfYear()-today.getDayOfYear();
        System.out.println(day1);
        int day2 = silvester2.getDayOfYear()-today.getDayOfYear();
        System.out.println(day2);
        System.out.println(silvester1.getDayOfYear());
    }
}
package lesson08.hw08anton;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class UnixSeconds {
    public static void main(String[] args) {
        getUnixTime();
    }

    private static LocalDate getInput() {
        System.out.println("Please insert Date like dd.mm.yyyy");
        Scanner scanner = new Scanner(System.in);
        return LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    private static void getUnixTime() {
        LocalDate input = getInput();
        long unix = input.toEpochDay() * 24 * 60 * 60 * 1000;
        System.out.println("The UnixTime is: " + unix);
        System.out.println("Test date with given UnixTime is : " + new Date(unix).toGMTString());
    }
}

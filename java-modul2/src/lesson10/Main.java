package lesson10;

import jdk.jfr.DataAmount;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        WeekDay firstDay = WeekDay.MONDAY;
        WeekDay foursDay = WeekDay.THURSDAY;

        DayOfWeek monday = DayOfWeek.MONDAY;
        /*System.out.println(DayOfWeek.FRIDAY.ordinal());
        System.out.println(DayOfWeek.MONDAY.ordinal());
        System.out.println(Arrays.toString(DayOfWeek.values()));
        System.out.println(DayOfWeek.TUESDAY.getTitle());
        DayOfWeek.SUNDAY.sayHello();
       // DayOfWeek.SUNDAY.

        System.out.println(Gender.MALE);
        System.out.println(Gender.MALE.getGender());*/

        Schedule schedule = new Schedule();
        schedule.wakeUp(DayOfWeek.TUESDAY);
        schedule.wakeUp(DayOfWeek.SATURDAY);
        schedule.getMenuCantine(DayOfWeek.MONDAY);
        schedule.displayWeekMenu();
    }
}

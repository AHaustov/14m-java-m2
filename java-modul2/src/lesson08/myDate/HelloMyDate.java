package lesson08.myDate;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class HelloMyDate {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);
        Date dateStart = new Date(0);
        System.out.println(dateStart);
        Date anotherDate = new Date(1_451_665_447_567L);
        System.out.println(anotherDate);
        Date theEnd = new Date(Long.MAX_VALUE);
        System.out.println(theEnd);
        split();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(anotherDate);
        System.out.println(calendar);
        split();
        System.out.println("calendar.getTime()" + calendar.getTime());
        calendar.setTime(new Date(120, 10, 12));
        System.out.println(calendar.getTime());
        calendar.add(Calendar.WEEK_OF_MONTH, 1);
        calendar.add(Calendar.MINUTE, 5);
        System.out.println(calendar.getTime());
        split();

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dateFormat1.format(calendar.getTime()));
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(dateFormat2.format(calendar.getTime()));
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(dateFormat3.format(calendar.getTime()));
    }

    private static void split() {
        System.out.println("-------------------");
    }
}

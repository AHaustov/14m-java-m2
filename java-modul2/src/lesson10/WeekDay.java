package lesson10;

import java.util.Objects;

public class WeekDay {
    private String titleOfDay;

    private WeekDay(String titleOfDay) {
        this.titleOfDay = titleOfDay;
    }

    public final static WeekDay MONDAY = new WeekDay("1");
    public final static WeekDay TUESDAY = new WeekDay("2");
    public final static WeekDay WEDNESDAY = new WeekDay("3");
    public final static WeekDay THURSDAY = new WeekDay("4");
    public final static WeekDay FRIDAY = new WeekDay("5");
    public final static WeekDay SATURDAY = new WeekDay("6");
    public final static WeekDay SUNDAY = new WeekDay("7");

    @Override
    public String toString() {
        return "WeekDay{" +
                "titleOfDay='" + titleOfDay + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WeekDay)) return false;
        WeekDay weekDay = (WeekDay) o;
        return Objects.equals(titleOfDay, weekDay.titleOfDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleOfDay);
    }
}

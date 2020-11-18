package lesson10.hw.bak_anton;

public enum Gender {
    MALE(1),
    FEMALE(2),
    DIVERSE(3);
    // look at file WeekDay.java, how it was done
    private int gender;

    private Gender(int gender) {
        this.gender = gender;
    }

    public int getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "gender=" + gender +
                '}';
    }

}
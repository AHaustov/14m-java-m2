package lesson10.hw.bak_nadja;

public enum Gender {
    MALE(1),
    FEMALE(2),
    DIVERSE(3);
    public int gender;

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

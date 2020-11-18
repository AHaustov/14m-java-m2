package lesson10.hw.bak_eduard;

public enum Gender {
    MALE("Gender MALE", 100),
    FEMALE("Gender FEMALE", 200),
    DIVERSE("Gender diversity", 300);

    private final String gender;
    private final int genID;

    Gender(String gender, int genID) {
        this.gender = gender;
        this.genID = genID;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "ordinal='" + ordinal() + '\'' +
                "name='" + name() + '\'' +
                "gender=" + gender +
                ", genID=" + genID +
                '}';
    }
}

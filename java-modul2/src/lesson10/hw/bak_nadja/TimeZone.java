package lesson10.hw.bak_nadja;

public enum TimeZone {
    BERLIN("BER"),
    MOSCOW("MOS"),
    MILAN("MIL");
    public String city;

    TimeZone(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

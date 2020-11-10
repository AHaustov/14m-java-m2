package lesson06.hw6anton.zoo;

public class Zmei extends Pet {
    int headCount;
    boolean shapeshift;

    public Zmei(String name) {
        super(name);
        this.food = "sheep";
    }

    void moves() {
        this.flies();
    }

    void flies() {
        System.out.println("Flies around");
    }

    void cry() {
        if (shapeshift) {
            this.humanTalk();
        } else
            this.dragonCry();
    }

    void humanTalk() {
        System.out.println("Hello World.");
    }

    void dragonCry() {
        System.out.println("Roooaaarr.");
    }

}

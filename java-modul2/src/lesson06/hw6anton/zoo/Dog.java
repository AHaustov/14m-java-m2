package lesson06.hw6anton.zoo;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
        this.food = "Meat and some stuff from your plate";
    }

    void moves() {
        this.run();
    }

    void run() {
        System.out.println("Runs around and comes back.");
    }

    void cry() {
        this.wuff();
    }

    void wuff() {
        System.out.println("Wuff,wuff.");
    }
}

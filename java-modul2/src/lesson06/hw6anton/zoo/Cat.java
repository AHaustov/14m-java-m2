package lesson06.hw6anton.zoo;

public class Cat extends Pet {
    int life;

    public Cat(String name) {
        super(name);
        this.food = "fish";
        this.life = 9;
    }


    void moves() {
        this.go();
    }


    void cry() {
        this.meow();
    }

    void meow() {
        System.out.println("Meow,meow.");
    }

    void go() {
        System.out.println("This cat moves slowly to the next sunny spot and lay down.");
    }
}

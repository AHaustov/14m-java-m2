package lesson03;

public class Human {
    private String name;
    public int speed;
    Dog dog;

    // Constructor
    public Human() {

    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void walk(int speed) {
        this.speed = speed;
    }

    public void walkWithDog(int speed) {
        walk(speed);
        dog.runAround(speed * 3);
    }

}

class Dog {
    private String nameDog;
    private int speedDog;

    public Dog(String name) {
        this.nameDog = name;
    }

    public void runAround(int skorost) {
        this.speedDog = skorost;
        System.out.println("Скорость собаки" + speedDog);
    }

    public void eat() {
        System.out.println("Дай мне мяса!");
    }

    int getSpeedDog() {
        return this.speedDog;
    }
}

class Test {
    public static void main(String[] args) {
        Human dame = new Human("Екатерина");
        // dame.name = "Афдофья";
        dame.setName("Афдофья");
        System.out.println(dame.getName());
        dame.walk(3);
        System.out.println("Скорость " + dame.speed);
        Dog dog = new Dog("Тузик");
        dame.dog = dog;
        dame.walkWithDog(10);
        //System.out.println("Скорость собачки " + dog.getSpeedDog());
    }
}
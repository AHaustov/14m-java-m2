package lesson06.hw6anton.zoo;

abstract class Pet {
    String name;
    String color;
    String owner = "Me";
    int birthDay;
    String food;

    public Pet(String name) {
        this.name = name;
    }

    abstract void moves();

    abstract void cry();

    protected void eats() {
        System.out.println("Your " + name + " ate some " + food + ".");
    }
}

class Test {
    public static void main(String[] args) {
        Pet cat1 = new Cat("Tom");
        Pet dog1 = new Dog("Brutus");
        Pet dragon1 = new Zmei("Gorgon");
        Zmei dragon2 = new Zmei("Haaron");
        dragon1.eats();
        dragon2.shapeshift=true;
        dragon2.moves();
        dragon2.cry();
    }
}

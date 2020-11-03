package lesson02;

public class Person {
    String name;
    double weight;
    double height;
    double bmi;
    int age;

    public Person() {

    }

    public Person(String username, double userWeight, double userHeight, int userAge) {
        age = userAge;
        weight = userWeight;
        height = userHeight;
        name = username;
        findBMI();
    }

    public Person(String username, double userWeight, double userHeight) {
        weight = userWeight;
        height = userHeight;
        name = username;
        findBMI();
    }

    void findBMI() {
        bmi = weight * 10000 / (height * height);
    }

    public void displayInfo() {
        System.out.println("The name is: " + name);
        System.out.println("The BMI of this person is: " + bmi);
    }
}

class PersonTest {
    public static void main(String[] args) {
        /*Person hausmeister = new Person();
        hausmeister.name = "Vasili";
        hausmeister.weight = 100;
        hausmeister.height = 200;
        hausmeister.findBMI();*/
        //hausmeister.displayInfo();
        Person user = new Person("Vasili", 100, 200);
        user.displayInfo();
        Person vova = new Person("Vova", 76, 187);
        vova.displayInfo();
    }
}
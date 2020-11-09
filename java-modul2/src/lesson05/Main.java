package lesson05;

public class Main {
    public static void main(String[] args) {
        double hour = 100.0;
        double minValueSalary = 9.14;
        // Методы класса, которые существуют и ДОСТУПНЫ для запуска всегда - статичные
        System.out.println(Person.calculateSalary(hour, minValueSalary));

        Person teacher = new Person("Andrej");
        Person.cry("BBBBBBBBBBBBBBBBBBBB");

        // Методы объекта, которые может использовать только ИНСТАНЦИЯ объекта, после СОЗДАНИЯ объекта
        teacher.setSalary(1000);
        teacher.cry();

    }

}

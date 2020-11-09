package lesson05;

public class Person {
    String name;
    double salary;

    public Person(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static double calculateSalary(double hour, double minSalaryProHour) {
        return hour * minSalaryProHour;
    }

    protected void cry() {
        cry("hdfhfghgfhfghjgfjfjgfj");
        System.out.println(this);
    }

    protected static void cry(String cryVois) {
        System.out.println(cryVois);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

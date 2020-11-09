package lesson05.uni;

public class Worker extends UniUser{
    private String firstName;
    private String secondName;
    private String uniID;
    private String position;
    private int age;
    private double eatCooficient = 0.8;

    public Worker(String firstName) {
        super(firstName);
    }

    public Worker(String uniID, int age) {
        super(uniID, age);
    }

    public void works() {
        System.out.println("Работать!");
    }

}

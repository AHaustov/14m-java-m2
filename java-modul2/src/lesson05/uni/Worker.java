package lesson05.uni;

public final class Worker extends UniUser {
    private String position;
    private double eatCoefficient = 0.8;

    public Worker(String firstName) {
        super(firstName);
    }

    public Worker(String uniID, int age) {
        super(uniID, age);
    }

    public Worker(String firstname, String secondName, int age) {
        super(firstname, secondName, age);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void salaryNegotiation(double income) {
        this.setUniSalary(income);
    }

    public void getPaid() {
        this.valueBankAcc += this.getUniSalary();
    }

    public void works() {
        System.out.println("Работать!");
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Worker{" +
                "position='" + position + '\'' +
                ", eatCooficient=" + eatCoefficient +
                '}';
    }
}

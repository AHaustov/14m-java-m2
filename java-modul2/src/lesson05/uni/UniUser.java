package lesson05.uni;

public class UniUser extends Person {
    String uniID;
    private double uniSalary = 0.00;

    public UniUser(String firstName) {
        super(firstName);
    }

    public UniUser(String firstname, String secondName, int age) {
        super(firstname, secondName, age);
    }

    public UniUser(String firstName, String uniID) {
        super(firstName);
        this.uniID = uniID;
    }

    public UniUser(String uniID, int age) {
        this.uniID = uniID;
        super.age = age;
    }

    public UniUser(String firstName, String secondName, String uniID, int age) {
        super(firstName, secondName, age);
        this.uniID = uniID;
    }

    public String getUniID() {
        return uniID;
    }

    public void setUniID(String uniID) {
        this.uniID = uniID;
    }

    protected double getUniSalary() {
        return uniSalary;
    }

    protected void setUniSalary(double uniSalary) {
        this.uniSalary = uniSalary;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "UniUser{" +
                "uniID='" + uniID + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object input) {
        UniUser user = (UniUser) input;
        return this.firstName.equalsIgnoreCase(user.firstName) &&
                this.uniID.equals(user.uniID);
    }
}

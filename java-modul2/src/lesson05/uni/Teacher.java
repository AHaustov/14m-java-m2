package lesson05.uni;


public final class Teacher extends UniUser {
    private String subject;
    private String position;
    private String range;
    private String degree;

    public Teacher(String firstName) {
        super(firstName);
    }

    public Teacher(String firstname, String secondName, int age) {
        super(firstname, secondName, age);
    }

    public Teacher(String firstName, String secondName, String uniID, int age, String range) {
        super(firstName, secondName, uniID, age);
        this.range = range;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void salaryNegotiation(double income) {
        this.setUniSalary(income);
    }

    public void getPaid() {
        this.valueBankAcc += this.getUniSalary();
    }

    public void teach() {
        System.out.println("Должен учиться, учиться и ещё раз учиться!");
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Teacher{" +
                "subject='" + subject + '\'' +
                ", position='" + position + '\'' +
                ", range='" + range + '\'' +
                ", degree='" + degree + '\'' +
                '}';
    }
}

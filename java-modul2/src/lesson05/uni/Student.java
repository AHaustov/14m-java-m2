package lesson05.uni;

public final class Student extends UniUser {
    private String subject;

    public Student(String firstName) {
        super(firstName);
    }

    public Student(String uniID, int age, String subject) {
        super(uniID, age);
        this.subject = subject;
    }

    public Student(String firstName, String secondName, String uniID, int age) {
        super(firstName, secondName, uniID, age);
    }


    public void study() {
        System.out.println("Должен учиться, учиться и ещё раз учиться!");
    }

    @Override
    public void eats() {
        System.out.println("В столовой все цены со скидкой. Скидка = ");
    }

    @Override
    public String toString() {
        return super.toString() + '\'' + "Student{" +
                "subject='" + subject + '\'' +
                '}';
    }
}

package lesson05.uni;

public class UniApplication {
    public static void main(String[] args) {
       /* //inheritanceIntroduction();
        Student sasha = new Student("Саша");
        Teacher masha = new Teacher("Маша");
        Worker glasha = new Worker("Глаша");
        UniUser pasha = new Student("Паша");
        UniUser sergej = new UniUser("Сергей");
        UniUser andrej = new Teacher("Андрей");
        Object ob = new Teacher("Завуч");
        Teacher newteacher = (Teacher) ob;
        //Student st = (Student) ob;

        UniUser[] neArray = new UniUser[10];
        Student[] collegs = new Student[20];
        System.out.println(ob);
        System.out.println(newteacher);
        andrej.walks(10);
        System.out.println(andrej.getValueBankAcc());
        masha.salaryNegotiation(3500.00);*/

        Person max = new Person("Max", "Mustermann", 35);
        Person martha = new Person("Martha", "Musterfrau", 38);
        Student peter = new Student("Peter", "Parker", 23);
        Student bob = new Student("Bob", "Bender", 17);
        Worker sarah = new Worker("Sarah", "Super", 28);
        Worker brian = new Worker("Brian", "Tailor", 31);
        Worker tom = new Worker("Tom", "West", 21);
        Teacher brandon = new Teacher("Brandon", "Brown", 65);
        Teacher melissa = new Teacher("Melissa", "Miles", 46);

        Person[] pArr = {max, martha, peter, bob, sarah, brian, tom, brandon, melissa};
        Worker[] wArr = {sarah, brian, tom};
        Teacher[] tArr = {brandon, melissa, sarah.changeToTeacher(), bob.changeToTeacher()};
        Student[] sArr = {peter, bob, sarah.changeToStudent(), tom.changeToStudent(), peter.changeToStudent()};
        Person.sortAge(pArr);
        Person.sortAge(wArr);
        Person.sortAge(tArr);
        Person.sortAge(sArr);
        Person.printArr(pArr);
        Person.printArr(wArr);
        Person.printArr(tArr);
        Person.printArr(sArr);
        Person.printArr(Person.delete(wArr, 2));
        Person.printArr(wArr);
        Person.printArr(Person.add(wArr, 1, brandon));
    }

    private static void inheritanceIntroduction() {
        Student pasha = new Student(
                "3544365436",
                35,
                "Java-Программист"
        );

        System.out.println(pasha);

        Teacher dasha = new Teacher(
                "Даша",
                "Соловьёва",
                "1234567",
                35,
                "Профессор"
        );
        System.out.println(dasha);
    }

}

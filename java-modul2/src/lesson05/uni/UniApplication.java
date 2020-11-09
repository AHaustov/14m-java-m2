package lesson05.uni;

public class UniApplication {
    public static void main(String[] args) {
        //inheritanceIntroduction();
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

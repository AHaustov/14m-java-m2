package lesson05;

import lesson05.uni.Student;

public class MyEquals {
    public static void main(String[] args) {
        Student st1 = new Student(
                "Даша",
                "Соловьёва",
                "12345",
                27);
        Student st2 = new Student("Даша",
                "Соловьёва",
                "12345",
                27);
        System.out.println(st1.equals(st2));
        //System.out.println(st1.myEquals(st2));
    }
}

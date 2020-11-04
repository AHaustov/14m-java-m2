package lesson03;

public class HelloString {
    public static void main(String[] args) {
        String firstName1 = "Андрей";
        String firstName2 = "Андрей";
        String firstName3 = new String("Андрей");
        String firstName4 = new String("Андрей2");

        System.out.println(firstName1 == firstName2);
        System.out.println("OOP " + (firstName1 == firstName2));
        System.out.println("OOP " + firstName2 == firstName3);
        System.out.println("OOP " + firstName3 == firstName4);
        System.out.println("----------------");
        System.out.println(firstName1.equals(firstName2));
        System.out.println(firstName1.equals(firstName3));
        System.out.println(firstName1.equals(firstName4));
        System.out.println(firstName2.equals(firstName3));
        System.out.println(firstName3.equals(firstName4));
    }
}

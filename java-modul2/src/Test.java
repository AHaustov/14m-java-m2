import lesson03.Human;

public class Test {
    public static void main(String[] args) {
        Human dame = new Human("Екатерина");
        // dame.name = "Афдофья";
        dame.setName("Афдофья");
        System.out.println(dame.getName());
        dame.walk(3);
        System.out.println("Скорость " + dame.speed);
    }
}

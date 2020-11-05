import lesson03.Human;
import lesson04.Book;

public class Test {
    public static void main(String[] args) {
/*        Human dame = new Human("Екатерина");
        // dame.name = "Афдофья";
        dame.setName("Афдофья");
        System.out.println(dame.getName());
        dame.walk(3);
        System.out.println("Скорость " + dame.speed);*/
        Book bk1 = new Book();
        Book bk2 = new Book();
        System.out.println(Book.getExemplar());
        Book.getExemplar();
        bk1.getAuthor();

        Book bk3 = new Book();
        System.out.println(Book.getExemplar());

        System.out.println(Book.country);

        System.out.println(bk1);

        Book bk4 = new Book("Война и Мир", "Лев Толстой", 2020);
        System.out.println(bk4);

    }
}

package lesson08.myFamily;

public class FamilyApplication {
    public static void main(String[] args) {
        Person hausmasterVasilij
                = new Person("Василий", "мальчик");
        Person vasilisa
                = new Person("Василиса", "девочка");
        Family fam1 = new Family(
                hausmasterVasilij,
                vasilisa,
                "Голубковы"
        );
        // mutable vs imutable

    }
}

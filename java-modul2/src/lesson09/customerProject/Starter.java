package lesson09.customerProject;

public class Starter {
    public static void main(String[] args) {
        Ingredient vodka = new Ingredient("Водка", 100);
        Ingredient rom = new Ingredient("Ром", 100);
        Ingredient martini = new Ingredient("Мартини", 100);
        Ingredient cola = new Ingredient("Кола", 100);
        Ingredient energiser = new Ingredient("RedBull", 100);

        Cocktail disko = new Cocktail("Диско", cola, energiser);
        System.out.println(disko);

    }
}

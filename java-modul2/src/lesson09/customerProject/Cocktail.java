package lesson09.customerProject;

import java.util.Arrays;

public class Cocktail {
    private String name;
    private Ingredient[] ingredients;
    private int liquid;
    private double perCent; // крепость коктейля
    private double price;

    private void setPerCent(){
        // формула есть
        // Volume* perCent + Volume na percent/ lkfelotk= perCent cocktail
    }

    public double getPerCent() {
        return perCent;
    }

    public Cocktail(String name, Ingredient... ingredients) {
        this.name = name;
        this.ingredients = ingredients;
        setPerCent();
    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "name='" + name + '\'' +
                ", liquid=" + liquid + ", " +
                "ingredient=" + Arrays.toString(ingredients) +
                '}';
    }
}


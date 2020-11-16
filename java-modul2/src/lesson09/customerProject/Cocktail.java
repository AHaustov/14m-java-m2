package lesson09.customerProject;

import java.util.Arrays;

public class Cocktail {
    private String name;
    private Ingredient[] ingredients;
    private int liquid;

    public Cocktail(String name, Ingredient... ingredients) {
        this.name = name;
        this.ingredients = ingredients;
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


package lesson09.customerProject;

import java.util.Arrays;

public class Cocktail extends Drinks {
    private Ingredient[] ingredients;
    private int liquid;
    private int perCent;

    public Cocktail(String name, Ingredient... ingredients) {
        super(name, "Cocktail");
        this.ingredients = ingredients;
        this.liquid = findLiquid(ingredients);
        this.perCent = findPerCent(ingredients);
        setPrice(makePrice(ingredients));
    }

    private double makePrice(Ingredient[] ingredients) {
        double invest = 0;
        for (Ingredient ingredient : ingredients) {
            invest += ingredient.getPrice();
        }
        return 4 * invest;
    }

    private int findPerCent(Ingredient[] ingredients) {
        int result = 0;
        for (Ingredient ingredient : ingredients) {
            result += ingredient.getPerCent() * ingredient.getLiquid();
        }
        return result / findLiquid(ingredients);
    }

    private int findLiquid(Ingredient[] ingredients) {
        int result = 0;
        for (Ingredient ingredient : ingredients) {
            result += ingredient.getLiquid();
        }
        return result;
    }

    @Override
    public String toString() {
        return "\n\nCocktail='" +
                getName() + '\'' +
                " volume= " + perCent + "%, " +
                " content= " + liquid + "ml " +
                " price= " + Math.round(getPrice()) + "€" + "\n" +
                printIngredients(ingredients);

    }

    private String printIngredients(Ingredient[] ingredients) {
        String result = "";
        for (Ingredient ingredient : ingredients) {
            result += "\'" + ingredient.getName() + "\'" + ingredient.getLiquid() + "ml ";
        }
        return result;
    }
}


package lesson09.customerProject;

class Ingredient {
    private String name;
    private boolean alcohol;
    private int liquid;
    private int perCent;  // крепость ингредиента

    public Ingredient(String name, int liquid) {
        this.name = name;
        this.liquid = liquid;
    }

    @Override
    public String toString() {
        return "\nIngredient{" +
                "name='" + name + '\'' +
                ", alcohol=" + alcohol +
                ", liquid=" + liquid +
                ", perCent=" + perCent +
                '}';
    }
}
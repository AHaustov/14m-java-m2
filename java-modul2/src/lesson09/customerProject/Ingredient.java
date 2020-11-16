package lesson09.customerProject;

class Ingredient extends Drinks {
    private boolean alcohol;
    private int liquid;
    private int perCent;

    public Ingredient() {

    }

    public Ingredient(String name, int liquid, int perCent, double price) {
        super(name, "Alcoholfree Drinks");
        this.liquid = liquid;
        this.perCent = perCent;
        alcohol = perCent > 0;
        setPrice(price);
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public int getLiquid() {
        return liquid;
    }

    public int getPerCent() {
        return perCent;
    }

    @Override
    public String toString() {
        return "\n'" + getName() + '\'' + liquid + "ml " + Math.round(getPrice() * 4) + "€";
    }
}

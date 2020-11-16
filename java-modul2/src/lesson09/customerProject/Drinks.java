package lesson09.customerProject;

public class Drinks {
    private String name;
    private String sortOf;
    private double price;

    public Drinks() {
    }

    public Drinks(String name, String sortOf) {
        this.name = name;
        this.sortOf = sortOf;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" +
                "name='" + name + '\'' +
                ", sortOf='" + sortOf + '\'' +
                '}';
    }
}

package BUILDER;

public class Drink {

    private String milliliters = "";
    private String name = "";
    private double price = 0;

    public void setMilliliters(String milliliters) {
        this.milliliters = milliliters;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getMilliliters() {
        return milliliters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

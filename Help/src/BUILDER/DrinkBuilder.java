package BUILDER;

public abstract class DrinkBuilder {
    protected Drink drink;

    public Drink getDrink() {
        return drink;
    }

    public void createNewDrinkProduct() {
        drink = new Drink();
    }

    public abstract void buildMilliliters();
    public abstract void buildName();
    public abstract void buildPrice();
}

package BUILDER;

public class Director {
    private PizzaBuilder pizzaBuilder;
    private DrinkBuilder drinkBuilder;

    public void setDrinkBuilder(DrinkBuilder drinkBuilder) {
        this.drinkBuilder = drinkBuilder;
    }

    public Drink getDrink() {
        return drinkBuilder.getDrink();
    }

    public void constructDrink() {
        drinkBuilder.createNewDrinkProduct();
        drinkBuilder.buildName();
        drinkBuilder.buildMilliliters();
        drinkBuilder.buildPrice();
    }

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildName();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
        pizzaBuilder.buildPrice();
    }
}

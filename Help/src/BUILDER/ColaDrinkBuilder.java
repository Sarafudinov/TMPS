package BUILDER;

public class ColaDrinkBuilder extends DrinkBuilder{
    @Override
    public void buildMilliliters() {
        drink.setMilliliters("250");
    }

    @Override
    public void buildPrice() {
        drink.setPrice(15);
    }

    @Override
    public void buildName() {
        drink.setName("Coca-Cola");
    }
}

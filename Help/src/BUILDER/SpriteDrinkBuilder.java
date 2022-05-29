package BUILDER;

public class SpriteDrinkBuilder extends DrinkBuilder{
    @Override
    public void buildMilliliters() {
        drink.setMilliliters("50");
    }

    @Override
    public void buildPrice() {
        drink.setPrice(45);
    }

    @Override
    public void buildName() {
        drink.setName("Sprite Drink");
    }
}

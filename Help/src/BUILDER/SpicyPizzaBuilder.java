package BUILDER;

public class SpicyPizzaBuilder extends PizzaBuilder{
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    public void buildSauce() {
        pizza.setSauce("hot");
    }

    public void buildTopping() {
        pizza.setTopping("pepperoni+salami");
    }

    @Override
    public void buildPrice() {
        pizza.setPrice(150);
    }

    @Override
    public void buildName() {
        pizza.setName("Spicy Pizza");
    }
}

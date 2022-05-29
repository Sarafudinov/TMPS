package BUILDER;

// Concrete Builder
public class HawaiianPizzaBuilder extends PizzaBuilder{
    public void buildDough() {
        pizza.setDough("cross");
    }

    public void buildSauce() {
        pizza.setSauce("mild");
    }

    public void buildTopping() {
        pizza.setTopping("ham+pineapple");
    }

    @Override
    public void buildName() {
        pizza.setName("Hawaiian Pizza");
    }

    @Override
    public void buildPrice() {
        pizza.setPrice(100);
    }
}

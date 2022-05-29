package FACTORY;

public class Bicycle implements Delivery{
    @Override
    public void deliveryMethod() {
        System.out.println("Delivery method was selected: bicycle");
    }
}

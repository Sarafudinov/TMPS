package FACTORY;

public class Car implements Delivery {
    @Override
    public void deliveryMethod() {
        System.out.println("Delivery method was selected: car");
    }
}

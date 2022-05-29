package FACTORY;

public class ConcreteCreatorBicycle extends Creator {

    @Override
    public Delivery Create() {
        return new Bicycle();
    }
}

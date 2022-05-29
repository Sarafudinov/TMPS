package FACTORY;

public class ConcreteCreatorCar extends Creator {
    @Override
    public Delivery Create() {
        return new Car();
    }
}

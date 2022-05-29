package FACTORY;

public abstract class Creator {

    public void deliveryMethod(){
        Delivery delivery = Create();
        delivery.deliveryMethod();
    }

    protected abstract Delivery Create();

}

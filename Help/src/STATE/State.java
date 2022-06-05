package STATE;

import FACADE.Order;

public abstract class State {
    Order order;

    State(Order order){
        this.order = order;
    }

    public abstract String onOrderPicking();
    public abstract String onDelivery();
    public abstract String onOrderPayment();

}

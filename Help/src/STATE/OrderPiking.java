package STATE;

import FACADE.Order;

public class OrderPiking extends State {

    public OrderPiking(Order order) {
        super(order);
        order.setOrderState(false);
    }

    @Override
    public String onOrderPicking() {
        if (order.isOrderState()){
            order.setState(new ReadyState(order));
        }
        return "Order is Picked";
    }

    @Override
    public String onDelivery() {
        order.setState(new ReadyState(order));
        return "Ready";
    }

    @Override
    public String onOrderPayment() {
        return "Locked...";
    }
}

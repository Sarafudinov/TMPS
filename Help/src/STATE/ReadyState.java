package STATE;

import FACADE.Order;

public class ReadyState extends State{

    ReadyState(Order order) {
        super(order);
    }

    @Override
    public String onOrderPicking() {
        return "Locked";
    }

    @Override
    public String onDelivery() {
        order.setState(new DeliveryState(order));
        return "Start Delivering";
    }

    @Override
    public String onOrderPayment() {
        return "Locked";
    }
}

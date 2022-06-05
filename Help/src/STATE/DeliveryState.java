package STATE;

import FACADE.Order;

public class DeliveryState extends State {
    public DeliveryState(Order order) {
        super(order);
    }

    @Override
    public String onOrderPicking() {
        return "Locked";
    }

    @Override
    public String onDelivery() {
        return "Locked";
    }

    @Override
    public String onOrderPayment() {
        return "Pay for the order";
    }
}

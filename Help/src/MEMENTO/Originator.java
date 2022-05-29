package MEMENTO;

import FACADE.Order;

public class Originator {
    private Order order;
    public void setOrder(Order order)
    {
        System.out.println("Originator: ");
        order.orderInfo();
        this.order = order;
    }
    public Memento save()
    {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(order);
    }
    public void restore(Memento m)
    {
        order = m.getOrder();
        System.out.println("Originator: State after restoring from Memento: ");
        order.orderInfo();
    }
}

package MEMENTO;
import FACADE.Order;


public class Memento {
    private Order order;

    public Memento(Order o){
        order = o;
    }

    public Order getOrder() {
        return order;
    }
}

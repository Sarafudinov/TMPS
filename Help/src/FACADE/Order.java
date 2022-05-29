package FACADE;

import BUILDER.Drink;
import BUILDER.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Pizza> orderPizza;
    private int pizzaCount = 1;
    private int drinkCount = 1;
    private List<Drink> orderDrink;
    private double price = 0;
    private double deliveryPrice = 0;

    public Order() {
        orderDrink = new ArrayList<>();
        orderPizza = new ArrayList<>();
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        price = 0;
        for (Pizza pizza : orderPizza) {
            price += pizza.getPrice();
        }

        for (Drink drink : orderDrink) {
            price += drink.getPrice();
        }

        return price + deliveryPrice;
    }

    public List<Pizza> getOrderPizza() {
        return orderPizza;
    }

    public void setOrderPizza(Pizza orderPizza) {
        if (!this.orderPizza.contains(orderPizza))
            this.orderPizza.add(orderPizza);
        else
            pizzaCount++;
    }

    public List<Drink> getOrderDrink() {
        return orderDrink;
    }

    public void setOrderDrink(Drink orderDrink) {
        if (!this.orderDrink.contains(orderDrink))
            this.orderDrink.add(orderDrink);
        else
            drinkCount++;
    }

    public int getPizzaCount() {
        return pizzaCount;
    }

    public void setPizzaCount(int pizzaCount) {
        this.pizzaCount = pizzaCount;
    }

    public int getDrinkCount() {
        return drinkCount;
    }

    public void setDrinkCount(int drinkCount) {
        this.drinkCount = drinkCount;
    }



    public void orderInfo() {
        for (Pizza pi: orderPizza) {
            System.out.println("Pizza: " + pi.getName() + " count: " + pizzaCount);
        }
        for (Drink dr: orderDrink){
            System.out.println("Drink: " + dr.getName() + " count: " + drinkCount);
        }
        System.out.println( "Order cost " + this.getPrice());
    }
}

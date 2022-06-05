package TEMPLATE_METHOD;

import FACADE.Order;

public class AndisPizza extends DeliveryRestaurant{

    private String restaurantName;
    private String restaurantLocation;

    public AndisPizza(String restaurantName, String restaurantLocation) {
        this.restaurantName = restaurantName;
        this.restaurantLocation = restaurantLocation;
    }

    @Override
    public void changeOrderPrice(Order order) {
        int value = 20;
        if(deliveryPossibility(this.restaurantLocation)){
            order.setDiscount(-value);
            order.setPrice(order.getPrice());
            order.setKm(order.getKm() + value);
        }
        else{
            order.setDiscount(value);
            order.setPrice(order.getPrice());
            order.setKm(Math.abs(order.getKm() - value));
        }
        order.setCollectOrderInfo("\nRestaurant Location: " + restaurantLocation + "\nRestaurant Name: " + restaurantName +
                "\ndue to the fact that you are in the same city as the restaurant, the cost is reduced by " + value);
        order.orderInfo();
    }
}

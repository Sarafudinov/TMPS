package TEMPLATE_METHOD;

import FACADE.Order;

public class AndisPizza extends DeliveryRestaurant{

    private String restaurantName;
    private String UserLocation;
    private String restaurantLocation;

    public AndisPizza(String restaurantName, String UserLocation) {
        this.restaurantName = restaurantName;
        this.UserLocation = UserLocation;
    }

    @Override
    public void changeOrderPrice(Order order) {
        int value = 20;
        String str;
        restaurantLocation = super.randomRestaurantLocation();
        if(restaurantLocation.equals(UserLocation)){
            order.setDiscount(value);
            order.setPrice(order.getPrice());
            order.setKm(Math.abs(order.getKm() - value));
            str = "due to the fact that you are in the same city as the restaurant, the cost is reduced by ";
        }
        else{
            order.setDiscount(-value);
            order.setPrice(order.getPrice());
            order.setKm(order.getKm() + value);
            str = "due to the fact that you are in another city, the cost increases by ";
        }
        order.setCollectOrderInfo("\nRestaurant Location: " + restaurantLocation + "\nRestaurant Name: " + restaurantName +
                "\n" + str + value);
        order.orderInfo();
    }
}

package TEMPLATE_METHOD;


import FACADE.Order;

import java.util.Random;

public abstract class DeliveryRestaurant {
    private String restaurantLocation;

    public DeliveryRestaurant(){
    }

    public String randomRestaurantLocation(){
        Random rand = new Random();
        switch (rand.nextInt(4)+1){
            case 1 -> restaurantLocation = restaurantsLocation.ONE.toString();
            case 2 -> restaurantLocation = restaurantsLocation.TWO.toString();
            case 3 -> restaurantLocation = restaurantsLocation.THREE.toString();
            case 4 -> restaurantLocation = restaurantsLocation.FOUR.toString();
        }
        return restaurantLocation;
    }

    public abstract void changeOrderPrice(Order order);

    public boolean deliveryPossibility(String yourLocation){
        return !this.restaurantLocation.equals(yourLocation);
    }
}

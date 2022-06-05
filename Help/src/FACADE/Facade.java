package FACADE;
import BUILDER.*;
import FACTORY.ConcreteCreatorBicycle;
import FACTORY.ConcreteCreatorCar;
import FACTORY.Creator;
import PROXY.CardPayment;
import PROXY.Payment;
import STATE.OrderPiking;
import TEMPLATE_METHOD.AndisPizza;
import TEMPLATE_METHOD.DeliveryRestaurant;
import TEMPLATE_METHOD.McDonalds;
import TEMPLATE_METHOD.restaurantsLocation;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Facade {

    double orderPrice;
    String ans;
    Scanner scanner;
    Order order;

    public Facade() {

        order = new Order();
        scanner = new Scanner(System.in);

        orderPrice = 0;
        ans = "";
        order.setKm((int)(Math.random()*10) + 1);
    }

    public void MenuSelection(){
        while(!ans.equals("no")) {

            System.out.println("What would you like to order?");
            System.out.println("1. Pizza");
            System.out.println("2. Drinks");
            ans = scanner.nextLine();

            Director director = new Director();
            Pizza pizza;
            Drink drink;

            switch (ans) {
                case "1" -> {
                    System.out.println("What kind of pizza do you want?");
                    System.out.println("1. Hawaiian Pizza");
                    System.out.println("2. Spicy Pizza");
                    ans = scanner.nextLine();
                    switch (ans) {
                        case "1" -> {
                            PizzaBuilder hawaiianPizza = new HawaiianPizzaBuilder();
                            director.setPizzaBuilder(hawaiianPizza);
                        }
                        case "2" -> {
                            PizzaBuilder spicyPizza = new SpicyPizzaBuilder();
                            director.setPizzaBuilder(spicyPizza);
                        }
                    }
                    director.constructPizza();
                    pizza = director.getPizza();
                    order.setOrderPizza(pizza);
                }
                case "2" -> {
                    System.out.println("What kind of drink do you want?");
                    System.out.println("1. Cola");
                    System.out.println("2. Sprite");
                    ans = scanner.nextLine();
                    switch (ans) {
                        case "1" -> {
                            DrinkBuilder colaDrink = new ColaDrinkBuilder();
                            director.setDrinkBuilder(colaDrink);
                        }
                        case "2" -> {
                            DrinkBuilder spriteDrink = new SpriteDrinkBuilder();
                            director.setDrinkBuilder(spriteDrink);
                        }
                    }
                    director.constructDrink();
                    drink = director.getDrink();
                    order.setOrderDrink(drink);
                }
            }

            System.out.println("anything else?");
            System.out.println("no");
            System.out.println("yes");

            ans = scanner.nextLine();

            if (ans.toLowerCase(Locale.ROOT).equals("no")) {
                order.orderInfo();
                break;
            }
        }
        order.setState(new OrderPiking(order));
        order.setOrderState(true);
        System.out.println("\n--------------------State Pattern---------------------\n");
        System.out.println(order.getState().onOrderPicking());
        orderPrice += order.getPrice(); //order cost
    }

    public void ChoiceOfShippingMethod(){

        System.out.println("choose a delivery method");
        System.out.println("1. Bicycle (5/km)");
        System.out.println("2. Car (10/km)");
        ans = scanner.nextLine();
        Creator creator;
        int inc;
        switch (ans){
            case "1" ->{
                inc = 5;
                creator = new ConcreteCreatorBicycle();
                order.setCollectOrderInfo("\nDelivery method: Bicycle(" + order.getKm() + "km)");
            }
            case "2" -> {
                inc = 10;
                creator = new ConcreteCreatorCar();
                order.setCollectOrderInfo("\nDelivery method: Car (" + order.getKm() + "km)");
            }
            default -> throw new IllegalStateException("Unexpected value: " + ans);
        }
        creator.deliveryMethod();
        System.out.println("km: " + order.getKm());
        orderPrice += inc * order.getKm() - order.getDiscount();
        order.setDeliveryPrice(inc * order.getKm());
        order.setPrice(order.getPrice() - order.getDiscount() + order.getDeliveryPrice());
        order.setCollectOrderInfo("\nDelivery Price: " + order.getDeliveryPrice());
        System.out.println("Order cost: " + (int) orderPrice);
        System.out.println("\n--------------------State Pattern---------------------\n");
        System.out.println(order.getState().onDelivery());
    }

    public void OrderPayment(){
        System.out.println("\n--------------------State Pattern---------------------\n");
        System.out.println(order.getState().onOrderPayment());
        System.out.println("\n--------------------Proxy pattern--------------------\n");
        Payment payment;
        payment = new CardPayment(orderPrice);
        payment.paymentMethod();
    }

    public void getOrderInfo(){
        order.orderInfo();
    }

    public void selectRestaurant(){
        DeliveryRestaurant deliveryRestaurant;

        Random rand = new Random();
        String randomLocation = "";
        switch (rand.nextInt(4)+1){
            case 1 -> randomLocation = restaurantsLocation.ONE.toString();
            case 2 -> randomLocation = restaurantsLocation.TWO.toString();
            case 3 -> randomLocation = restaurantsLocation.THREE.toString();
            case 4 -> randomLocation = restaurantsLocation.FOUR.toString();
        }

        order.setCollectOrderInfo("\nYour Location: " + randomLocation);

        System.out.println("""
                Choose restaurant for delivery.
                1. McDonalds
                2. AndisPizza""");
        ans = scanner.nextLine();
        switch (ans){
            case "1" -> deliveryRestaurant = new McDonalds("McDonalds", randomLocation);
            case "2" -> deliveryRestaurant = new AndisPizza("AndisPizza", randomLocation);
            default ->  deliveryRestaurant = new McDonalds("McDonalds", "Chisinau");

        }

        deliveryRestaurant.changeOrderPrice(order);
    }
}

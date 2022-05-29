package FACADE;
import BUILDER.*;
import FACTORY.Car;
import FACTORY.ConcreteCreatorBicycle;
import FACTORY.ConcreteCreatorCar;
import FACTORY.Creator;
import MEMENTO.Caretaker;
import MEMENTO.Originator;
import PROXY.CardPayment;
import PROXY.CashPayment;
import PROXY.Payment;

import java.util.Locale;
import java.util.Scanner;

public class Facade {

    double orderPrice = 0;
    String ans = "";
    Scanner scanner = new Scanner(System.in);
    Order order = new Order();

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
                System.out.println("Your order:");
                order.orderInfo();
                break;
            }
        }

        orderPrice += order.getPrice(); //order cost
    }

    public void ChoiceOfShippingMethod(){

        System.out.println("choose a delivery method");
        System.out.println("1. Bicycle (5/km)");
        System.out.println("2. Car (10/km)");
        ans = scanner.nextLine();
        Creator creator;
        switch (ans){
            case "1" ->{
                //creating a shipping method
                creator = new ConcreteCreatorBicycle();
                creator.deliveryMethod();
                int km = (int)(Math.random()*10) + 1;
                System.out.println("km: " + km);
                orderPrice += 5 * km;
                order.setDeliveryPrice(5*km);
            }
            case "2" -> {
                //creating a shipping method
                creator = new ConcreteCreatorCar();
                creator.deliveryMethod();
                int km = (int)(Math.random()*10) + 1;
                System.out.println("km: " + km);
                orderPrice += 10 * km;
                order.setDeliveryPrice(10*km);
            }
        }

    }

    public void getOrderPrice() {
        System.out.println("Order cost: " + (int) orderPrice); }

    public void OrderPayment(){

        Payment payment;
        payment = new CardPayment(orderPrice);
        payment.paymentMethod();
    }

    Caretaker caretaker = new Caretaker();
    Originator originator = new Originator();

    public void saveOrder(){
        order.setPrice(orderPrice);
        originator.setOrder(order);
        caretaker.addMemento(originator.save());
    }

    public void restoreOrder(){
        originator.restore(caretaker.getMemento(0));
    }
}

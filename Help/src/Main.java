import FACADE.Facade;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n--------------------Facade Pattern--------------------\n");

        Facade facade = new Facade();

        System.out.println("\n--------------------Builder pattern--------------------\n");

        facade.MenuSelection();

        System.out.println("\n--------------------Template pattern--------------------\n");

        facade.selectRestaurant();

        System.out.println("\n--------------------Factory pattern--------------------\n");

        facade.ChoiceOfShippingMethod();

        facade.OrderPayment();

        facade.getOrderInfo();

    }

}

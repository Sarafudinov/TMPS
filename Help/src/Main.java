import FACADE.Facade;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n--------------------Facade Pattern--------------------\n");

        Facade facade = new Facade();

        System.out.println("\n--------------------Memento pattern--------------------\n");

        facade.saveOrder();

        System.out.println("\n--------------------Builder pattern--------------------\n");

        facade.MenuSelection();

        System.out.println("\n--------------------Factory pattern--------------------\n");

        facade.ChoiceOfShippingMethod();

        facade.getOrderPrice();

        System.out.println("\n--------------------Proxy pattern--------------------\n");

        facade.OrderPayment();

        System.out.println("\n--------------------Memento pattern--------------------\n");

        facade.saveOrder();

        facade.restoreOrder();

        System.out.println("\n--------------------Builder pattern--------------------\n");

        facade.MenuSelection();

        System.out.println("\n--------------------Factory pattern--------------------\n");

        facade.ChoiceOfShippingMethod();

        facade.getOrderPrice();

        System.out.println("\n--------------------Proxy pattern--------------------\n");

        facade.OrderPayment();

        System.out.println("\n--------------------Memento pattern--------------------\n");

        facade.saveOrder();

        facade.restoreOrder();

    }

}

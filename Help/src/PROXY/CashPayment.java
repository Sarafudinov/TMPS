package PROXY;

public class CashPayment implements Payment{

    private double money;
    private double spend;

    public CashPayment(double orderPrice, double money){
        spend = orderPrice;
        this.money = money;
    }

    @Override
    public void paymentMethod() {
        System.out.println("wallet balance: " + money);
        System.out.println("Was wasted: " + spend);
        System.out.println("Left in wallet: " + (money - spend));
        this.money -= spend;
    }

    public double getMoney() {
        return money;
    }

    public double getSpend() {
        return spend;
    }
}

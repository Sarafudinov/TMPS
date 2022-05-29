package PROXY;

//proxy
public class CardPayment implements Payment{

    private CashPayment cashPayment;
    private double money = (int)(Math.random() * 1000);
    private double spend;

    public CardPayment(double orderPrice){
        spend = orderPrice;
    }

    @Override
    public void paymentMethod() {

        if(cashPayment == null && money - spend >= 0) {
            cashPayment=new CashPayment(spend, money);
            cashPayment.paymentMethod();
        }
        else {
            System.out.println("There are not enough funds in your account");
            System.out.println("Wallet balance: " + money);
            System.out.println("Need: " + spend);
        }
    }
}

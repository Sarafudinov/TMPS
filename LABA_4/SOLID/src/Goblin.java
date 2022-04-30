public class Goblin implements EnemyThief{
    private int coins;

    @Override
    public String battleRoar() {
        return "Gobliiiins!!!";
    }

    @Override
    public void pillage() {
        int tmp =(int)(Math.random()*10);
        coins += tmp;
        System.out.println("was stolen " + tmp + " coins");
    }

    public int getCoins() {
        return coins;
    }
}

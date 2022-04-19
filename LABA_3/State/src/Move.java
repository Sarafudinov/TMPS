// concrete state

public class Move extends State{

    public Move(Player player) {
        super(player);
    }

    @Override
    public void doAction() {
        System.out.println("Start move animation");
        int counter=0;
        int randomWays = (int)(Math.random()*10)+1;
        while (counter++ < randomWays) {
            player.setX((int)(Math.random()*10));
            player.setY((int)(Math.random()*10));
            System.out.println("Player position: x = " + player.getX() + " y = " + player.getY());
        }
    }
}

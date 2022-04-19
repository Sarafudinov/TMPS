// concrete state

public class Idle extends State {

    public Idle(Player player) {
        super(player);
    }

    @Override
    public void doAction() {
        System.out.println("Start idle animation");
        System.out.println("Player position: x = " + player.getX() + " y = " + player.getY());
    }
}

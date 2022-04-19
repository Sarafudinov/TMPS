// State

public abstract class State {

    Player player;

    State(Player player) {
        this.player = player;
    }

    public abstract void doAction();
}

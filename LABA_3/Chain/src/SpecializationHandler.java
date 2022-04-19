public abstract class SpecializationHandler {

    protected SpecializationHandler next;

    public SpecializationHandler getNext() {
        return next;
    }

    public void setNext(SpecializationHandler next) {
        this.next = next;
    }

    public abstract void handleAction(Player player, int point);

}

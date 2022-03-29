package helper_classes;

public class Tree implements mapObject{
    private int posX;
    private int posY;

    @Override
    public void setPos(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    @Override
    public String toString() {
        String[] name = getClass().getName().split("\\.");
        return  name[1] + " position: \tx = " + posX + " \ty = " + posY;
    }
}

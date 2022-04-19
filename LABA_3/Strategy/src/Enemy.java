// helper class for adding logic

public class Enemy {

    private int hp;
    private  int dmg;
    private int xPosition, yPosition;

    public Enemy(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.hp =(int)(Math.random()*100)+10;
        this.dmg =(int)(Math.random()*10);
    }

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    @Override
    public String toString() {
        return "Enemy:" +
                "\thp = " + hp +
                "\tdmg = " + dmg;
    }
}

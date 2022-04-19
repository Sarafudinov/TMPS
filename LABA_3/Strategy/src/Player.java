// Context strategy

public class Player {

    private AttackStrategy attackStrategy;
    private int hp = 1000;
    private int dmg;
    private int xPosition, yPosition;
    private String heroType;

    public Player(int xPosition, int yPosition, String heroType) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.heroType = heroType;
        this.dmg =(int)(Math.random()*10)+10;
    }

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public String getHeroType() {
        return heroType;
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
        return "Player:" +
                "\thp = " + hp +
                "\tdmg = " + dmg +
                "\tStrategy = " + attackStrategy;
    }
}

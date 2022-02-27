package MyAbstractFactoryPattern.Models;

public class Player{

    private int gen;
    private int hp;
    private int xp;
    private int dmg;
    private int lvl;
    private int lvlLimit = 4;

    public Player() {
    }

    public Player(int gen, int hp, int xp, int dmg, int lvl) {
        this.gen = gen;
        this.hp = hp;
        this.xp = xp;
        this.dmg = dmg;
        this.lvl = lvl;
    }

    @Override
    public String toString() {
        return "Player{" +
                "gen=" + gen +
                ", hp=" + hp +
                ", xp=" + xp +
                ", dmg=" + dmg +
                ", lvl=" + lvl +
                ", lvlBar=" + lvlLimit +
                '}';
    }

    public boolean isAlive(){
        return this.hp > 0;
    }

    public int getLvl() {
        return lvl;
    }

    public int getGen() {
        return gen;
    }

    public int getHp() {
        return hp;
    }

    public int getXp() {
        return xp;
    }

    public int getDmg() {
        return dmg;
    }

    public void fight(Enemy enemy){
        this.hp -= enemy.getDmg();
        if (!enemy.isAlive()){
            this.xp += enemy.getXp();
        }
    }

    public void lvlUp(Player player){

        while(this.xp >= lvlLimit){
            this.hp += 50;
            this.dmg += 2;
            this.xp -= lvlLimit;
            this.lvl ++;
            this.lvlLimit += 4 * (this.lvl - 1);
        }
    }

    public void getXpLvl(int xp){
        this.xp += xp;
    }
}

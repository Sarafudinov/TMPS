package MyAbstractFactoryPattern.EmenyFactory;
import MyAbstractFactoryPattern.Models.Enemy;
import MyAbstractFactoryPattern.Models.Player;

public class OrcArcher extends Enemy implements Archer{
    private int hp;
    private int xp;
    private int gen;
    private int dmg;

    public OrcArcher(int gen, int hp, int xp, int dmg) {
        this.gen = gen;
        this.hp = hp;
        this.xp = xp;
        this.dmg = dmg;
    }

    @Override
    public void fight(Player player) {
        this.hp -= player.getDmg();
        if (!this.isAlive()){
            player.getXpLvl(this.xp + 4);
        }
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getXp() {
        return xp;
    }

    @Override
    public int getGen() {
        return gen;
    }

    @Override
    public int getDmg() {
        return dmg;
    }

    @Override
    public boolean isAlive(){ return this.hp > 0; }

    @Override
    public void lvlUp(Enemy enemy, int gen){
        this.gen = gen;
        this.hp += 5*this.gen;
        this.xp += 3*this.gen;
        this.dmg += 4*this.gen;
    }

    @Override
    public String toString(){
        return "Orc Archer{ " +
                "gen=" + this.getGen() +
                ", hp=" + this.getHp() +
                ", xp=" + this.getXp() +
                ", dmg=" + this.getDmg() +
                '}';
    }
}

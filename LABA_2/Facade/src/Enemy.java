public class Enemy {

    int hp;
    int exp;
    int dmg;

    public Enemy(int hp, int exp, int dmg) {
        this.hp = hp;
        this.exp = exp;
        this.dmg = dmg;
    }

    @Override
    public String toString() {
        return  "Enemy{" +
                " hp = " + hp +
                ", exp = " + exp +
                ", dmg = " + dmg +
                " }";
    }
}

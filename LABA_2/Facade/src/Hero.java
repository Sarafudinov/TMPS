public class Hero {
    int hp;
    int exp;
    int dmg;

    public Hero(int hp, int exp, int dmg) {
        this.hp = hp;
        this.exp = exp;
        this.dmg = dmg;
    }

    @Override
    public String toString() {
        return  "Hero{" +
                " hp = " + hp +
                ", exp = " + exp +
                ", dmg = " + dmg +
                " }";
    }
}

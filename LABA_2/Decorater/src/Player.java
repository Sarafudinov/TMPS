public class Player {

    private int exp = 0;
    private int level = 0;
    private IHeroArmor heroArmor;

    public Player(int exp, int level, IHeroArmor heroArmor) {
        this.exp = exp;
        this.level = level;
        this.heroArmor = heroArmor;
    }

    public int getExp() {
        return exp;
    }

    public int getLevel() {
        return level;
    }

    public IHeroArmor getHeroArmor() {
        return heroArmor;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHeroArmor(IHeroArmor heroArmor) {
        this.heroArmor = heroArmor;
    }

    public void levelUp(){
        if (this.exp == 10 + 2*level)
            this.level++;
    }
}

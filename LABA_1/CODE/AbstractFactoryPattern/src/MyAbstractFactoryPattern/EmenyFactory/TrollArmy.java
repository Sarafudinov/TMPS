package MyAbstractFactoryPattern.EmenyFactory;

public class TrollArmy implements EnemyAbstractFactory{

    @Override
    public Archer createArcher(int gen, int hp, int xp, int dmg) {
        return new TrollArcher(gen, hp, xp, dmg);
    }

    @Override
    public Warrior createWarrior(int gen, int hp, int xp, int dmg) {
        return new TrollWarrior(gen, hp, xp, dmg);
    }
}

package MyAbstractFactoryPattern.EmenyFactory;

public class OrcArmy implements EnemyAbstractFactory{

    @Override
    public Archer createArcher(int gen, int hp, int xp, int dmg) {
        return new OrcArcher(gen, hp, xp, dmg);
    }

    @Override
    public Warrior createWarrior(int gen, int hp, int xp, int dmg) {
        return new OrcWarrior(gen, hp, xp, dmg);
    }
}

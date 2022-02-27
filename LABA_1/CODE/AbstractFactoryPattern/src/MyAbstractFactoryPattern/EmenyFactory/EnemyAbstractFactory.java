package MyAbstractFactoryPattern.EmenyFactory;

public interface EnemyAbstractFactory {
    Archer createArcher(int gen, int hp, int xp, int dmg);
    Warrior createWarrior(int gen, int hp, int xp, int dmg);
}

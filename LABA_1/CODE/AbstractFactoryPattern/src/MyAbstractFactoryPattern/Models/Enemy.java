package MyAbstractFactoryPattern.Models;

import MyAbstractFactoryPattern.EmenyFactory.EnemyAbstractFactory;
import MyAbstractFactoryPattern.EmenyFactory.OrcArmy;
import MyAbstractFactoryPattern.EmenyFactory.TrollArmy;

import java.util.Random;

public class Enemy{

    private int gen = 1;
    private int hp;
    private int xp;
    private int dmg;

    public Enemy() {
    }

    @Override
    public String toString() {
        return  "Enemy{ " +
                "gen=" + gen +
                ", hp=" + hp +
                ", xp=" + xp +
                ", dmg=" + dmg +
                '}';
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

    public int getDmg() { return dmg; }

    public boolean isAlive(){ return this.hp > 0; }

    public void fight(Player player) {
        System.out.println("ENEMY FIGHT");
    }

    public void lvlUp(Enemy enemy, int gen){
        this.gen = gen;
        this.hp += 10*this.gen;
        this.xp += 2*this.gen;
        this.dmg += 2*this.gen;
    }

    public Enemy createEnemy(){

        EnemyAbstractFactory orcEnemyFactory = new OrcArmy();
        EnemyAbstractFactory trollEnemyFactory = new TrollArmy();
        Enemy enemy;

        //create random enemy
        Random random = new Random();
        enemy = switch (random.nextInt(4)) {
            case 0 -> (Enemy) orcEnemyFactory.createArcher(this.gen,
                    (int) (Math.random() * 5) + 1,
                    (int) (Math.random() * 5) + 1,
                    (int) (Math.random() * 2) + 1);
            case 1 -> (Enemy) orcEnemyFactory.createWarrior(this.gen,
                    (int) (Math.random() * 15) + 1,
                    (int) (Math.random() * 10) + 1,
                    (int) (Math.random() * 5) + 1);
            case 2 -> (Enemy) trollEnemyFactory.createArcher(this.gen,
                    (int) (Math.random() * 10) + 1,
                    (int) (Math.random() * 5) + 1,
                    (int) (Math.random() * 5) + 1);
            default -> (Enemy) trollEnemyFactory.createWarrior(this.gen,
                    (int) (Math.random() * 20) + 1,
                    (int) (Math.random() * 15) + 1,
                    (int) (Math.random() * 10) + 1);
        };
        return enemy;
    }

}
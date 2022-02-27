package MyAbstractFactoryPattern;

import MyAbstractFactoryPattern.Models.Enemy;
import MyAbstractFactoryPattern.Models.Player;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome to roguelike Dungeons & Heroes");

        int heroGen = 1, heroHp = 100, heroXp = 0, heroDmg = 10, heroLvl = 1, heroDies = 0;
        Player hero = new Player(heroGen, heroHp, heroXp, heroDmg, heroLvl);

        int enemyGen = 1, killCounter=10;;
        Enemy enemy = new Enemy();
        enemy = enemy.createEnemy();

        //hash codes
        int serialEnemyCod = enemy.hashCode();
        int serialHeroCod = hero.hashCode();

        //start menu
        System.out.println("Do you want to start the game?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        String choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextLine().toLowerCase(Locale.ROOT);

        if (choice.equals("1") || choice.equals("yes")) {

            //main loop
            while (true) {

                if (!enemy.isAlive()){
                    enemyGen++;
                    enemy = enemy.createEnemy();
                    enemy.lvlUp(enemy, enemyGen);
                    serialEnemyCod = enemy.hashCode();
                }

                //fight loop
                while (enemy.isAlive() && hero.isAlive()) {

                    //lvl check
                    hero.lvlUp(hero);
                    //fight
                    hero.fight(enemy);
                    enemy.fight(hero);

                    //info
                    if (hero.hashCode() == serialHeroCod)
                        System.out.println("H " + heroGen + " " + hero.hashCode() + "\t" + hero);
                    if (enemy.hashCode() == serialEnemyCod)
                        System.out.println("E " + enemyGen + " " + enemy.hashCode() + "\t" + enemy + "\n");
                }

                if (!hero.isAlive()) {
                    System.out.println("\nYOU ARE DIED on LVL: " + hero.getLvl());
                    System.out.println("Do you want to restart the game?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    choice = scanner.nextLine().toLowerCase(Locale.ROOT);

                    if (choice.equals("1") || choice.equals("yes")){

                        heroGen++; heroHp = 100*heroGen; heroXp = 0; heroDmg = 10*heroGen; heroLvl = 1;
                        hero = new Player(heroGen, heroHp, heroXp, heroDmg, heroLvl);

                        enemy = enemy.createEnemy();
                        enemyGen = 1;

                        serialEnemyCod = enemy.hashCode();
                        serialHeroCod = hero.hashCode();
                    }
                    else {
                        System.out.println("Thanks for your visit");
                        break;
                    }
                }
            }
        }
        else
            System.out.println("Thanks for your visit");

    }
}

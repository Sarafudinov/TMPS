// Main client

import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) {

        System.out.println("\nChoose your specialization: ");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.print("enter 1 or 2: ");

        Scanner scanner = new Scanner(System.in);
        String heroType = scanner.nextLine();

        switch (heroType){
            case "1" ->{ heroType = "Warrior"; }
            case "2" ->{ heroType = "Mage"; }
        }

        // create and init game objects
        Enemy distanceEnemy = new Enemy(1,5);
        Enemy nearEnemy = new Enemy(2,2);
        Player player = new Player(1,1, heroType);

        rangeCheck(player, nearEnemy);
        rangeCheck(player, distanceEnemy);

    }

    static void rangeCheck(Player player, Enemy enemy){
        // range between player and enemy
        int diffX = Math.abs(player.getXPosition() - enemy.getXPosition());
        int diffY = Math.abs(player.getYPosition() - enemy.getYPosition());

        // check if position is correct
        if (diffX == 0 && diffY == 0)
            return;

        // check x y positions, if the enemy stays close to the player, the player will melee attack
        if ((diffX == 0 || diffX == 1) && (diffY == 1 || diffY == 0)) {
            player.setAttackStrategy(new MeleeAttack());
            player.getAttackStrategy().attack(player, enemy);
        }
        // if the enemy is in line with the player, the player can use a ranged attack
        else if ((diffX == 0 || diffX == 1) || (diffY == 1 || diffY == 0)){
            player.setAttackStrategy(new RangedAttack());
            player.getAttackStrategy().attack(player, enemy);
        }
    }
}

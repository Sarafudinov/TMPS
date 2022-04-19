//  concrete Strategy ranged attack

import java.util.Locale;

public class RangedAttack implements AttackStrategy{

    private int rangedDamage;

    @Override
    public void attack(Player player, Enemy enemy) {

        switch (player.getHeroType().toLowerCase(Locale.ROOT)){
            case "warrior" -> {rangedDamage = Math.abs(player.getDmg() - 13);}
            case "mage" -> {rangedDamage = player.getDmg() * 3;}
        }
        if (rangedDamage == 0) rangedDamage ++;
        System.out.println("\n----------Enemy and Player info----------");

        System.out.println(enemy);
        System.out.println(player);

        System.out.println("Since the class of this player is a " + player.getHeroType() + ", his melee damage is " + rangedDamage);

        System.out.println("\n---------While enemy stay alive----------");
        while(enemy.getHp() > 0){

            enemy.setHp(enemy.getHp() - rangedDamage);
            player.setHp(player.getHp() - rangedDamage);

            System.out.println(enemy);
            System.out.println(player);
        }
    }

    @Override
    public String toString() {
        return "RangedAttack";
    }
}

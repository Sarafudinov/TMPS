//  concrete Strategy melee attack

import java.util.Locale;

public class MeleeAttack implements AttackStrategy{

    private int meleeDamage;

    @Override
    public void attack(Player player, Enemy enemy) {

        switch (player.getHeroType().toLowerCase(Locale.ROOT)){
            case "warrior" -> {meleeDamage = player.getDmg() * 2;}
            case "mage" -> {meleeDamage = player.getDmg() - 5;}
        }
        if (meleeDamage == 0) meleeDamage ++;
        System.out.println("\n----------Enemy and Player info----------");

        System.out.println(player);
        System.out.println(enemy);

        System.out.println("Since the class of this player is a " + player.getHeroType() + ", his melee damage is " + meleeDamage);


        System.out.println("\n---------While enemy stay alive----------");
        while(enemy.getHp() > 0){

            enemy.setHp(enemy.getHp() - meleeDamage);
            player.setHp(player.getHp() - meleeDamage);

            System.out.println(player);
            System.out.println(enemy);

        }


    }

    @Override
    public String toString() {
        return "MeleeAttack";
    }
}

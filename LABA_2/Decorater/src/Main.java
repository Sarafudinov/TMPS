import java.util.Random;

public class Main {
    public static void main(String[] args) {

        IHeroArmor heroArmor = new StandardArmor();
        Player player = new Player((int) (Math.random() * 10), (int) (Math.random() * 5),heroArmor);

        // A combat system is implemented and as the level increases, the character's equipment improves.

        System.out.println(player.getHeroArmor());

        // equipment upgrade system
        if (player.getLevel() > 2) {
            player.setHeroArmor(new LeatherArmor(player.getHeroArmor()));
        }
        else{
            player.setHeroArmor(new IronArmor(player.getHeroArmor()));
        }
        player.getHeroArmor().gameSkin();
        System.out.println(player.getHeroArmor());

    }
}

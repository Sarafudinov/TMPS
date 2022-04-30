import java.util.ArrayList;

/*
    S - Hero & Characteristics & AdditionalIndicators | Person & Inventory & PersonStatus
    O - Person & Hero | Characteristics & AdditionalIndicators
    L - Person & Hero
    I - EnemyThief & Goblin | EnemyMage & Elf
    D - EnemyThief & Goblin | EnemyMage & Elf
*/


public class Main {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i <= (int)(Math.random()*5); i++) {
            items.add(new Item("Weapon " + (i+1), "Super Weapon " + (i+1) , i+3));
        }

        Inventory inventory = new Inventory(items.size() + (int)(Math.random()*10), items);
        PersonStatus personStatus = new PersonStatus((int)(Math.random()*10), (int)(Math.random()*10), (int)(Math.random()*10));
        Person person = new Person("Random", "peasant", personStatus, inventory);

        Hero hero = new Hero("Hero", "Hero Sword Master",
                new PersonStatus((int)(Math.random()*10), (int)(Math.random()*10), (int)(Math.random()*10)),
                new Inventory(10, new ArrayList<>()),"Fire ball",
                new StandardCharacteristics((int)(Math.random()*10), (int)(Math.random()*10), (int)(Math.random()*10)));

        System.out.println("Hello user now you are:");
        System.out.println(person);
        System.out.println("");
        System.out.println(person.getClass() + " " + person.battleRoar());
        System.out.println("");

        System.out.println("Now you are Hero!!!");
        System.out.println(hero);
        System.out.println("");
        System.out.println(hero.getClass() + " " + hero.battleRoar());
        System.out.println("");

        System.out.println("Your Enemies: ");
        EnemyThief enemyThief = new Goblin();
        System.out.println(enemyThief.battleRoar());
        enemyThief.pillage();
        System.out.println("");
        EnemyMage enemyMage = new Elf();
        System.out.println(enemyMage.battleRoar());
        enemyMage.castSpell();

    }
}

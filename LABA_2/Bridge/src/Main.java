public class Main {
    public static void main(String[] args) {

        Mage mage = new Mage();
        mage.setParameters(100,10,10);

        Warrior warrior = new Warrior();
        warrior.setParameters(10,100,10);

        testSpeciality(mage);
        testSpeciality(warrior);
    }

    public static void testSpeciality(ISpeciality speciality) {
        System.out.println("\nTests with Goblin.");
        Goblin goblin = new Goblin(speciality);
        System.out.println("BattleRoar: \t" + goblin.battleRoar());
        System.out.println("Ability: \t\t" + speciality.castSpell("Goblin magic"));
        System.out.println("Description:\n\t" + speciality.getDescription());

        System.out.println("\nTests with HobGoblin.");
        HobGoblin hobGoblin = new HobGoblin(speciality);
        System.out.println("BattleRoar: \t" + hobGoblin.battleRoar());
        System.out.println("Ability: \t\t" + speciality.castSpell("HobGoblin magic"));
        System.out.println("Attack: \t\t" + hobGoblin.attack());
        System.out.println("Description:\n\t" + speciality.getDescription());
    }
}

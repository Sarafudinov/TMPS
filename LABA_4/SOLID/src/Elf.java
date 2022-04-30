public class Elf implements EnemyMage{
    private int mana = (int)(Math.random()*100);

    @Override
    public String battleRoar() {
        return "Elves are powerful mages!!!";
    }

    @Override
    public void castSpell() {
        int tmp = (int)(Math.random()*50);
        if (tmp > mana)
            System.out.println("no have mana to cast spell");
        else{
            mana -= tmp;
            System.out.println("Fireball cost " + tmp + " mana, " + mana + " remaining");
        }
    }
}

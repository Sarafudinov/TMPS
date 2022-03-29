public class Warrior implements ISpeciality{

    private String name = "Warrior";
    private int intelligence;
    private int strange;
    private int agility;

    @Override
    public String getNameSpeciality() {
        return name;
    }

    @Override
    public String castSpell(String spell) {
        return spell;
    }

    @Override
    public void setParameters(int intelligence, int strange, int agility) {
        this.intelligence = (int)(Math.random() * intelligence + 50);
        this.strange = (int)(Math.random() * strange + 100);
        this.agility = (int)(Math.random() * agility + 50);
    }

    @Override
    public String getDescription() {
        return name + ": The strongest warrior does not run from the battlefield"
                + "\n\tInt: " +intelligence
                + "\n\tStr: " +strange
                + "\n\tAgi: " +agility;
    }
}

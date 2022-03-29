public class Mage implements ISpeciality{

    private String name = "Mage";
    private int intelligence;
    private int strange;
    private int agility;

    @Override
    public String getNameSpeciality() {
        return name;
    }

    @Override
    public void setParameters(int intelligence, int strange, int agility) {
        this.intelligence = (int)(Math.random() * intelligence + 100);
        this.strange = (int)(Math.random() * strange + 50);
        this.agility = (int)(Math.random() * agility + 50);
    }

    @Override
    public String getDescription() {
        return name + ": Only the greatest sage can comprehend magic"
                + "\n\tInt: " +intelligence
                + "\n\tStr: " +strange
                + "\n\tAgi: " +agility;
    }

    @Override
    public String castSpell(String spell) {
        return spell;
    }
}

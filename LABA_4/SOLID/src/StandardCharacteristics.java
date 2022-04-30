public class StandardCharacteristics{

    private int intelligence;
    private int strange;
    private int agility;

    public StandardCharacteristics(int intelligence, int strange, int agility) {
        this.intelligence = intelligence;
        this.strange = strange;
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStrange() {
        return strange;
    }

    public void setStrange(int strange) {
        this.strange = strange;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    public String toString() {
        return "\n\t\t\tCharacteristics{" +
                "intelligence=" + intelligence +
                ", strange=" + strange +
                ", agility=" + agility +
                '}';
    }
}

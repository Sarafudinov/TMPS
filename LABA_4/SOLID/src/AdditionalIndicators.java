public class AdditionalIndicators extends StandardCharacteristics {
    private int bonusVitality;
    private int mana;
    private int shield;

    public AdditionalIndicators(int intelligence, int strange, int agility, int bonusVitality, int mana, int shield) {
        super(intelligence, strange, agility);
        this.bonusVitality = bonusVitality;
        this.mana = mana;
        this.shield = shield;
    }

    public int getBonusVitality() {
        return bonusVitality;
    }

    public void setBonusVitality(int bonusVitality) {
        this.bonusVitality = bonusVitality;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    @Override
    public String toString() {
        return "\n\t\t\tDetailedCharacteristics{" +
                "bonusVitality=" + bonusVitality +
                ", mana=" + mana +
                ", shield=" + shield +
                '}';
    }
}

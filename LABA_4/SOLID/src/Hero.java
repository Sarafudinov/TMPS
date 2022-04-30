// Open-closed principle
// extending the Person class to the Hero class

// Liskov substitution principle
// inherits the Person class and can performs the same functionality

public class Hero extends Person{

    private String superPower;
    private StandardCharacteristics standardCharacteristics;
    private AdditionalIndicators additionalIndicators;

    public Hero(String nickname, String specialization, PersonStatus status, Inventory inventory, String superPower, StandardCharacteristics standardCharacteristics) {
        super(nickname, specialization, status, inventory);
        this.superPower = superPower;
        this.standardCharacteristics = standardCharacteristics;
        this.additionalIndicators = new AdditionalIndicators(
                standardCharacteristics.getIntelligence(),
                standardCharacteristics.getStrange(),
                standardCharacteristics.getAgility(),
                standardCharacteristics.getStrange() * 10,
                standardCharacteristics.getIntelligence() * 100,
                standardCharacteristics.getAgility() * 2);
    }

    public StandardCharacteristics getCharacteristics() {
        return standardCharacteristics;
    }

    public void setCharacteristics(StandardCharacteristics standardCharacteristics) {
        this.standardCharacteristics = standardCharacteristics;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public AdditionalIndicators getDetailedCharacteristics() {
        return additionalIndicators;
    }

    public void setDetailedCharacteristics(AdditionalIndicators additionalIndicators) {
        this.additionalIndicators = additionalIndicators;
    }

    @Override
    public String battleRoar(){
        return "Battle Roar: For the Alliance!!!";
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t\tHero{" +
                "superPower='" + superPower + '\'' +
                ", characteristics=" + standardCharacteristics +
                ", detailedCharacteristics=" + additionalIndicators +
                '}';
    }
}

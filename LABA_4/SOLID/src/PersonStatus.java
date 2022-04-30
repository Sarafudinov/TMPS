// Single-responsibility principle
// responsible only for the state of the user

public class PersonStatus {
    private int health;
    private int experience;
    private int level;

    public PersonStatus(int health, int experience, int level) {
        this.health = health;
        this.experience = experience;
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "\n\tPersonStatus{" +
                "health=" + health +
                ", experience=" + experience +
                ", level=" + level +
                '}';
    }
}

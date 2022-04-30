// Single-responsibility principle
// responsible only for the condition of the item/weapon

public class Item {
    private String name;
    private String description;
    private int damagePower;

    public Item(String name, String description, int damagePower) {
        this.name = name;
        this.description = description;
        this.damagePower = damagePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDamagePower() {
        return damagePower;
    }

    public void setDamagePower(int damagePower) {
        this.damagePower = damagePower;
    }

    @Override
    public String toString() {
        return "\n\t\tItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", damagePower=" + damagePower +
                '}';
    }
}

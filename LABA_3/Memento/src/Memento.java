// Memento

public class Memento {

    private int preferSkin;
    private int pesos;
    private int experience;
    private int weaponLevel;

    public Memento(int preferSkin, int pesos, int experience, int weaponLevel) {
        this.preferSkin = preferSkin;
        this.pesos = pesos;
        this.experience = experience;
        this.weaponLevel = weaponLevel;
    }

    public int getPreferSkin() {
        return preferSkin;
    }

    public int getPesos() {
        return pesos;
    }

    public int getExperience() {
        return experience;
    }

    public int getWeaponLevel() {
        return weaponLevel;
    }

    public void setPreferSkin(int preferSkin) {
        this.preferSkin = preferSkin;
    }

    public void setPesos(int pesos) {
        this.pesos = pesos;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setWeaponLevel(int weaponLevel) {
        this.weaponLevel = weaponLevel;
    }
}

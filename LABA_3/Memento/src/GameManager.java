// Originator

public class GameManager {

    private int preferSkin;
    private int pesos;
    private int experience;
    private int weaponLevel;

    public GameManager(int preferSkin, int pesos, int experience, int weaponLevel) {
        this.preferSkin = preferSkin;
        this.pesos = pesos;
        this.experience = experience;
        this.weaponLevel = weaponLevel;
    }

    public GameManager() {
        this.preferSkin = 0;
        this.pesos = 0;
        this.experience = 0;
        this.weaponLevel = 0;
    }

    public Memento SaveState()
    {
        return new Memento(preferSkin, pesos, experience, weaponLevel);
    }

    public void RestoreState(Memento memento)
    {
        this.preferSkin = memento.getPreferSkin();
        this.pesos = memento.getPesos();
        this.experience = memento.getExperience();
        this.weaponLevel = memento.getWeaponLevel();
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

    @Override
    public String toString() {
        return "\nGameManager" +
                "\n\tpreferSkin=" + preferSkin +
                "\n\tpesos=" + pesos +
                "\n\texperience=" + experience +
                "\n\tweaponLevel=" + weaponLevel;
    }
}

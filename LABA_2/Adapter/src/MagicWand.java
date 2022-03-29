public class MagicWand {
    private String weaponType;
    private String weaponName;

    public MagicWand() {
    }

    public MagicWand(String weaponType, String weaponName) {
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }

    public String getSlotType() {
        return weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}

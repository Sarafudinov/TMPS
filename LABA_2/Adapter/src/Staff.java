public class Staff {
    private String weaponType;
    private String weaponName;

    public Staff() {
    }

    public Staff(String weaponType, String weaponName) {
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }

    public String getSlotType() {
        return weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }
}

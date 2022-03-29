public class Main {
    public static void main(String[] args) {
        WeaponSlot weaponSlot = new WeaponSlot("One hand");
        MagicWand wand = new MagicWand("One hand", "Fire Wand");

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~");

        weaponSlot.fits(wand);

        Staff oneHandStaff = new Staff("One hand", "Low power Staff");
        Staff twoHandStaff = new Staff("Two hand", "High power Staff");

        StaffAdapter oneHandAdapter = new StaffAdapter(oneHandStaff);
        StaffAdapter twoHandAdapter = new StaffAdapter(twoHandStaff);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~");

        weaponSlot.fits(oneHandAdapter);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~");

        weaponSlot.fits(twoHandAdapter);

    }
}

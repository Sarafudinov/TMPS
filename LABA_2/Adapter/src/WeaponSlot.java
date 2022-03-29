public class WeaponSlot {
    private String slotType;

    public WeaponSlot(String slotType) {
        this.slotType = slotType;
    }

    public String getSlotType() {
        return slotType;
    }

    public void fits(MagicWand wand) {

        switch (wand.getSlotType()){
            case "One hand" -> {
                System.out.println("One hand was equipped with a " + wand.getWeaponName());
                System.out.println("Shield in second hand");
            }
            case "Two hand" -> {
                System.out.println("Drop shield from second slot !!!!!!!!!!!!");
                System.out.println( wand.getWeaponName() + " equipped in both hands");
            }
        }
    }
}
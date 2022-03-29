public class StaffAdapter extends MagicWand{
    private Staff staff;

    public StaffAdapter(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String getSlotType() {
        this.setWeaponName(staff.getWeaponName());
        return staff.getSlotType();
    }
}

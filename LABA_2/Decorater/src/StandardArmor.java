public class StandardArmor extends IHeroArmor {

    @Override
    public void gameSkin() {
        this.setSkinType("Standard");
        this.setHelmet("None");
        this.setBib("Shirt");
        this.setGloves("None");
        this.setPants("trousers");
        this.setBoots("None");

        this.setPower(this.getSkinType());
    }

}

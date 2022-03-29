public class LeatherArmor extends BaseDecorator{

    public LeatherArmor(IHeroArmor heroArmor) {
        super(heroArmor);
    }

    @Override
    public void gameSkin(){
        super.gameSkin();

        this.setSkinType("Leather Armor");
        this.setHelmet("Leather helmet");
        this.setBib("Leather bib");
        this.setGloves("Leather gloves");
        this.setPants("Leather trousers");
        this.setBoots("Leather boots");

        this.setPower(this.getSkinType());
    }
}

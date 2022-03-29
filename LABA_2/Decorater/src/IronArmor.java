public class IronArmor extends BaseDecorator{

    public IronArmor(IHeroArmor heroArmor) {
        super(heroArmor);
    }

    @Override
    public void gameSkin(){
        super.gameSkin();

        this.setSkinType("Iron Armor");
        this.setHelmet("Iron helmet");
        this.setBib("Iron bib");
        this.setGloves("Iron gloves");
        this.setPants("Iron trousers");
        this.setBoots("Iron boots");

        this.setPower(this.getSkinType());
    }
}

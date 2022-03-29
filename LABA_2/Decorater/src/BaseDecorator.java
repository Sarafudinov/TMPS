public class BaseDecorator extends IHeroArmor {
    IHeroArmor heroArmor;

    public BaseDecorator(IHeroArmor heroArmor) {
        this.heroArmor = heroArmor;
    }

    @Override
    public void gameSkin() {
        this.heroArmor.gameSkin();
    }
}

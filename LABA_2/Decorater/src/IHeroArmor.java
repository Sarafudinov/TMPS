public abstract class IHeroArmor {
    abstract void gameSkin();

    private String skinType = "0";

    private String helmet;
    private String bib;
    private String gloves;
    private String pants;
    private String boots;

    private int helmetPower = 1;
    private int bibPower = 1;
    private int glovesPower = 1;
    private int pantsPower = 1;
    private int bootsPower = 1;

    private int armor = helmetPower + bibPower + glovesPower + pantsPower + bootsPower;

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public void setHelmet(String helmet) {
        this.helmet = helmet;
    }

    public void setBib(String bib) {
        this.bib = bib;
    }

    public void setGloves(String gloves) {
        this.gloves = gloves;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    public void setBoots(String boots) {
        this.boots = boots;
    }

    public void setPower(String type){
        switch (type) {
            case "Leather Armor" -> {
                helmetPower += Math.random()*5;
                bibPower += Math.random()*5;
                glovesPower += Math.random()*5;
                pantsPower += Math.random()*5;
                bootsPower += Math.random()*5;
            }
            case "Iron Armor" -> {
                helmetPower += Math.random()*10;
                bibPower += Math.random()*10;
                glovesPower += Math.random()*10;
                pantsPower += Math.random()*10;
                bootsPower += Math.random()*10;
            }
        }
        armor = helmetPower + bibPower + glovesPower + pantsPower + bootsPower;
    }

    @Override
    public String toString() {
        return "Skin by: " + this.getClass() +
                "\n\t|Skin Type: " + skinType +
                "\n\t|Helmet: " + helmet +
                "\n\t\t|Helmet Armor: " + helmetPower +
                "\n\t|Bib: " + bib +
                "\n\t\t|Bib Armor: " + bibPower +
                "\n\t|Gloves: " + gloves +
                "\n\t\t|Gloves Armor: " + glovesPower +
                "\n\t|Pants: " + pants +
                "\n\t\t|Pants Armor: " + pantsPower +
                "\n\t|Boots: " + boots +
                "\n\t\t|Boots Armor: " + bootsPower +
                "\n\t|Total Armor: " + armor + "\n";
    }

    public String getSkinType() {
        return skinType;
    }

    public int getArmor() {
        return armor;
    }
}

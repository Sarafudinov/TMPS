public class Goblin implements IHorde{

    protected ISpeciality speciality;

    public Goblin() {
    }

    public Goblin(ISpeciality speciality) {
        this.speciality = speciality;
    }

    @Override
    public String battleRoar() {
        return "Loc tar o Gar!!! I am " + getClass().getName() + ": " + speciality.getNameSpeciality();
    }

    @Override
    public boolean armor() {
        return !speciality.getNameSpeciality().equals("Mage");
    }

    @Override
    public void changeSpeciality() {
        switch (speciality.getNameSpeciality()) {
            case "Mage" -> {
                System.out.println("Change to warrior speciality");
                speciality.setParameters((int) (Math.random() * 50), (int) (Math.random() * 150), (int) (Math.random() * 50));
            }
            case "Warrior" -> {
                System.out.println("Change to mage speciality");
                speciality.setParameters((int) (Math.random() * 150), (int) (Math.random() * 50), (int) (Math.random() * 50));
            }
        }

    }


}

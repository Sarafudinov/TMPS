public class HobGoblin extends Goblin{

    public HobGoblin(ISpeciality speciality) {
        super(speciality);
    }

    public String attack(){
        return speciality.castSpell("pow pow paw");
    }
}

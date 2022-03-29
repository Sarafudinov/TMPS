public interface ISpeciality {

    String getNameSpeciality();

    void setParameters(int intelligence, int strange, int agility);

    String getDescription();

    String  castSpell(String spell);
}

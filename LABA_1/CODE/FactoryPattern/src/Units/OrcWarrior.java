package Units;
import Interfaces.*;
public class OrcWarrior implements IEnemy {
    @Override
    public void battleRoar() {
        System.out.println("My life for the horde");
    }

    @Override
    public String toString() {
        return "Orc Warrior";
    }
}

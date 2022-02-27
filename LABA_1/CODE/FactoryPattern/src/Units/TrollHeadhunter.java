package Units;
import Interfaces.*;
public class TrollHeadhunter implements IEnemy {

    @Override
    public void battleRoar() {
        System.out.println("Vengeance for Zul'jin");
    }

    @Override
    public String toString() {
        return "Troll Headhunter";
    }
}

package Units;
import Interfaces.*;
public class OgreMage implements IEnemy {

    @Override
    public void battleRoar() {
        System.out.println("Prepare to face the end of the world");
    }

    @Override
    public String toString() {
        return "Ogre Mage";
    }
}

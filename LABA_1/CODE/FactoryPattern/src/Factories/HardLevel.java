package Factories;

import Interfaces.*;
import Units.*;

import java.util.Random;

public class HardLevel implements IHorde {

    @Override
    public IEnemy create(){

        String[] enemies = {"Orc Warrior","Troll Headhunter", "Ogre Mage"};
        Random random = new Random();
        int choose = random.nextInt(enemies.length);

        return switch (choose) {
            case 0 -> new OrcWarrior();
            case 1 -> new TrollHeadhunter();
            case 2 -> new OgreMage();
            default -> throw new IllegalArgumentException("Таких конкретных классов нет D:");
        };
    }

    @Override
    public String toString() {
        return "Hard Level";
    }
}

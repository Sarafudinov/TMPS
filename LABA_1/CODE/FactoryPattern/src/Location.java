import GameObj.Tree;
import Interfaces.IEnemy;

public class Location {

    private IEnemy[] enemies;

    private Tree[] trees;

    public Location(IEnemy[] enemies, Tree[] trees)
    {
        this.enemies = enemies;
        this.trees = trees;
    }

    public void enemiesArmyInfo()
    {
        int orcCounter = 0, ogreCounter = 0, trollCounter = 0;

        for (IEnemy enemy : enemies) {
            if (enemy.getClass().toString().contains("OrcWarrior")) orcCounter++;
            else if (enemy.getClass().toString().contains("OgreMage")) ogreCounter++;
            else if (enemy.getClass().toString().contains("TrollHeadhunter")) trollCounter++;
        }

        if(orcCounter != 0)System.out.println(orcCounter + " Orc Warriors");
        if(ogreCounter != 0)System.out.println(ogreCounter + " Ogre Mages");
        if(trollCounter != 0)System.out.println(trollCounter + " Troll Headhunters");
    }

}

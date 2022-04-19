// Client

import Divisions.Division;

public class Main {

    public static void main(String[] args) {

        Army army = new Army();
        Division [] divisions = army.getNames();

        int counter = 0;
        for(Iterator iter = army.createIterator(); iter.hasNext();){
            String divisionName = iter.next().toString();
            System.out.println("Division : " + divisionName + " --> " +divisions[counter].BattleRoar());
            counter++;
        }
    }
}
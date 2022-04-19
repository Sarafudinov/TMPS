// Concrete Iterator

import Divisions.Division;

public class ArmyIterator implements Iterator {

    private Army army;
    private int index;
    private Division[] tmp = null;

    public ArmyIterator(Army army) {
        this.army = army;
    }

    @Override
    public boolean hasNext() {
        tmp = army.getNames();
        if(index < tmp.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {

        if(this.hasNext()){
            return tmp[index++];
        }
        return null;
    }
}

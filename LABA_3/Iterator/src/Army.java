// Concrete collection

import Divisions.*;

public class Army implements IterableCollection {
    private Division [] names = {new Orcs(), new Trolls(), new Ogres(), new Goblins()};

    @Override
    public Iterator createIterator() {
        return new ArmyIterator(this);
    }

    public Division [] getNames() {
        return names;
    }
}

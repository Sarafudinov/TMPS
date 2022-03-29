package helper_classes;

public class ObjectFactory {
    public mapObject createObjects(int x, int y){

        switch ((int) (Math.random() * 2)) {
            case 0 -> {
                Tree tree = new Tree();
                tree.setPos((int) (Math.random() * x), (int) (Math.random() * y));
                return tree;
            }
            case 1 -> {
                Rock rock = new Rock();
                rock.setPos((int) (Math.random() * x), (int) (Math.random() * y));
                return rock;
            }
        }

        return null;
    }
}

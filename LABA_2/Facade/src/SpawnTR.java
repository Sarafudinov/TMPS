import helper_classes.ObjectFactory;

public class SpawnTR {

    public void spawnObj(int width, int height){

        ObjectFactory objectFactory = new ObjectFactory();

        for (int i = 0; i < (int)(Math.random()*20)+5; i++) {
            System.out.println(objectFactory.createObjects(height, width) + " \t\t" + objectFactory.createObjects(height,width));
        }
    }
}

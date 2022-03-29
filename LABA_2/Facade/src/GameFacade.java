public class GameFacade {

    public void startGame(){
        // Create Map layer
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Map loading~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        MapLoader mapLoader = new MapLoader();
        mapLoader.mapSize();
        System.out.println(mapLoader);

        // Add objects in map
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Map filling~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        SpawnTR spawnTR = new SpawnTR();
        spawnTR.spawnObj(mapLoader.getWidth(), mapLoader.getHeight());

        // Add enemies
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Spawn Enemies~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        CreateEnemies createEnemies = new CreateEnemies();
        createEnemies.create();

        // Add hero
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Spawn Hero~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Hero hero = new Hero((int)(Math.random()*100), 0, (int)(Math.random()*10));
        System.out.println(hero);

        // Add more Logic
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Other Logic...~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

}

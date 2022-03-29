public class CreateEnemies {

    public void create(){
        for (int i = 0; i < (int)(Math.random()*20)+5; i++) {
            System.out.println(new Enemy(   i + (int)(Math.random()*20),
                                            i + (int)(Math.random()*20),
                                            i + (int)(Math.random()*20)));
        }
    }

}

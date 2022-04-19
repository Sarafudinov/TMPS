// Main client

public class MainClient {

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        EditorHistory history = new EditorHistory();

        setGameState(gameManager);

        System.out.println(gameManager);

        history.Push(gameManager.SaveState());

        setGameState(gameManager);

        System.out.println(gameManager);

        gameManager.RestoreState(history.Pop());

        System.out.println(gameManager);
    }

    private static void setGameState(GameManager gameManager){
        gameManager.setPreferSkin((int)(Math.random()*5));
        gameManager.setPesos((int)(Math.random()*200));
        gameManager.setExperience((int)(Math.random()*100));
        gameManager.setWeaponLevel((int)(Math.random()*6));
    }

}

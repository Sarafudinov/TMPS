import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Main extends JFrame implements KeyListener {

    private Thread thread;
    private static Player player;
    private static State idleState;
    private static State moveState;

    public Main(int width, int height) {
        this.setSize(width, height);
        this.addKeyListener(this);
        thread = new MoveThread(this);
        thread.start();
    }

    public static void main(String[] args) {

        // create states

        player = new Player(1,1,1,1);
        idleState = new Idle(player);
        moveState = new Move(player);

        JFrame frame = new Main(10,10);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // work with states

        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            player.setState(idleState);
            player.getState().doAction();
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT ||
                e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN){

            player.setState(moveState);
            player.getState().doAction();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    private class MoveThread extends Thread{
        Main runKeyboard;

        public MoveThread(Main runKeyboard) {
            super("MoveThread");
            this.runKeyboard = runKeyboard;
        }

        public void run(){
            while(true) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}



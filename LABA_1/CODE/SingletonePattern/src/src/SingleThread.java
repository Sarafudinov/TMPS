
public class SingleThread  {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("\nLet's start the game who will be the first to press the button.");
        System.out.println("Tom VS Jerry\n");

        //init players
        Thread Tom = new Thread(new ThreadTom());
        Thread Jerry = new Thread(new ThreadJerry());

        Tom.setName("Tom");
        Jerry.setName("Jerry");

        switch ((int) (Math.random() * 2)) {
            case 0 -> {
                System.out.println("First " + Jerry);
                Jerry.start();
                Thread.sleep(5);
                System.out.println("Second " + Tom);
                Tom.start();

                Tom.join();
                Jerry.join();
            }
            case 1 -> {
                System.out.println("First " + Tom);
                Tom.start();
                Thread.sleep(5);
                System.out.println("Second " + Jerry);
                Jerry.start();

                Jerry.join();
                Tom.join();
            }
        }



        System.out.println(Singleton.counter);
    }

    static class ThreadJerry implements Runnable {
        @Override
        public void run() {
            System.out.println("\tJerry THREAD STARTED");
            Singleton singleton = Singleton.getInstance("Jerry WIN");
            System.out.println(singleton + " " + singleton.value);
        }
    }

    static class ThreadTom implements Runnable {
        @Override
        public void run() {
            System.out.println("\tTom THREAD STARTED");
            Singleton singleton = Singleton.getInstance("Tom WIN");
            System.out.println(singleton + " " + singleton.value);
        }
    }
}

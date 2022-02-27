public class Singleton {

    private static volatile Singleton instance;

    public  static int counter = 0;
    public String value;

    private Singleton(String value) {
        this.value = value;
        counter++;
    }

    public static Singleton getInstance(String value) {

        Singleton result = instance;
        if (result != null) {return result;}

        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}

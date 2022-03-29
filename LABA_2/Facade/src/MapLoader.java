
public class MapLoader {
    private int height;
    private int width;

    public void mapSize(){
        switch ((int) (Math.random()*10)){
            case 0:
                width = 1280 ;
                height = 720 ;
                break;
            case 1:
                width = 1480  ;
                height = 720 ;
                break;
            case 2:
                width = 1520  ;
                height = 720 ;
                break;
            case 3:
                width = 1920  ;
                height = 1080  ;
                break;
            case 4:
                width = 2220  ;
                height = 1080  ;
                break;
            case 5:
                width = 2280  ;
                height = 1080 ;
                break;
            case 6:
                width = 3040  ;
                height = 1440  ;
                break;
            case 7:
                width = 3200  ;
                height = 1440 ;
                break;
            case 8:
                width = 3440  ;
                height = 1440 ;
                break;
            case 9:
                width = 5120  ;
                height = 1440 ;
                break;
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Map Size: " + width + " x " + height;
    }
}

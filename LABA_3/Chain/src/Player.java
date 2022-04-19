public class Player {

    private int exp;
    private String levelStatus = "Low";
    private String nickName;
    private String specialization;
    private int points = 0;

    public Player(int exp, String nickName, String specialization) {
        this.exp = exp;
        this.nickName = nickName;
        this.specialization = specialization;
    }

    public int getExp() {
        return exp;
    }

    public String getNickName() {
        return nickName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getLevelStatus() { return levelStatus; }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setLevelStatus(String levelStatus) {
        this.levelStatus = levelStatus;
    }

    public int levelUp(){

        // some level up logic

        int levelUp = (int) (Math.random() * 100) + points;

        System.out.print("You get " + levelUp);
        this.exp += levelUp;

        System.out.println(" exp ---> now: " + this.exp);
        return levelUp;
    }

    public void train(){

        // some system to train your player

        int count = (int) (Math.random() * 150);
        for (int i = 0; i < count; i++) {
            try {
                Thread.sleep(100);

                int percent = (int)(i * 100 / count);
                if (percent % 10 == 0)
                    System.out.println("Train: " + percent + "%");
                this.points++;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Train(" + points + "): " + 100 + "%");
    }
}

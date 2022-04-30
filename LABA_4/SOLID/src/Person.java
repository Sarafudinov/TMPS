
public class Person {
    private String nickname;
    private String specialization;
    private PersonStatus status;
    private Inventory inventory;

    public Person(String nickname, String specialization, PersonStatus status, Inventory inventory) {
        this.nickname = nickname;
        this.specialization = specialization;
        this.status = status;
        this.inventory = inventory;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public PersonStatus getStatus() {
        return status;
    }

    public void setStatus(PersonStatus status) {
        this.status = status;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String battleRoar(){
        return "Battle Roar!!!";
    }

    @Override
    public String toString() {
        return "Person{" +
                "nickname='" + nickname + '\'' +
                ", specialization='" + specialization + '\'' +
                ", status=" + status +
                ", inventory=" + inventory +
                '}';
    }
}
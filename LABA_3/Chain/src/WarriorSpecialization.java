public class WarriorSpecialization extends SpecializationHandler{

    private static final int needPoint = 200;

    @Override
    public void handleAction(Player player, int point) {
        if (player.getExp() + point > needPoint) {
            getNext().handleAction(player, point);
        }
        else {
            player.setSpecialization("Warrior");
            player.setLevelStatus("Medium");

            System.out.println(
                            "\nNickname = Bravest " + player.getNickName() +
                            "\nSpecialization = " + player.getSpecialization() +
                            "\nExp = " + player.getExp()
            );
        }
    }
}

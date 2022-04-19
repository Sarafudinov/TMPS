public class MilitiaSpecialization extends SpecializationHandler {

    private static final int needPoint = 100;

    @Override
    public void handleAction(Player player, int point) {
        if (player.getExp() + point > needPoint) {
            getNext().handleAction(player, point);
        }
        else {
            player.setSpecialization("Militia");
            player.setLevelStatus("Low");

            System.out.println(
                        "\nNickname = Miserable " + player.getNickName() +
                        "\nSpecialization = " + player.getSpecialization() +
                        "\nExp = " + player.getExp()
                        );
        }
    }
}

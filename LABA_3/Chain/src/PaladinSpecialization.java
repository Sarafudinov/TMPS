public class PaladinSpecialization extends SpecializationHandler{

    private static final int needPoint = 400;

    @Override
    public void handleAction(Player player, int point) {
        player.setSpecialization("Paladin");
        player.setLevelStatus("High");

        System.out.println(
                        "\nNickname = Sir " + player.getNickName() +
                        "\nSpecialization = " + player.getSpecialization() +
                        "\nExp = " + player.getExp()
        );
    }
}

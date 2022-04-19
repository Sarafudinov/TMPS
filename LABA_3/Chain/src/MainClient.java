import java.util.Locale;
import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) {

        // create specializations

        MilitiaSpecialization militia = new MilitiaSpecialization();
        WarriorSpecialization warrior = new WarriorSpecialization();
        PaladinSpecialization paladin = new PaladinSpecialization();

        // connect in one chain: militia --> warrior --> paladin

        militia.setNext(warrior);
        warrior.setNext(paladin);

        // work with user

        System.out.print("Enter your nickname: ");
        Scanner scanner = new Scanner(System.in);
        String nickname = scanner.nextLine();

        // creating new player and trying use chain with handle action

        Player player = new Player(0, nickname, "None");
        militia.handleAction(player, 0);

        // some interactive with user

        System.out.println("\nDo you want to remain a " + player.getSpecialization() +"?");
        String ans = scanner.nextLine();

        if (ans.toLowerCase(Locale.ROOT).equals("yes"))
            System.out.println("Good by " + player.getNickName());
        else{
            while (!player.getLevelStatus().equals("High")){
                player.train();
                militia.handleAction(player, player.levelUp());
            }
        }



    }

}

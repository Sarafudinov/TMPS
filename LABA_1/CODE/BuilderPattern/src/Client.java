import Builders.GamingPcBuilder;
import Builders.OfficePcBuilder;
import Builders.PC;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//Builders.Builder pattern
public class Client {

    public static void main(String[] args) {

        Director director = new Director();

        //gaming builder
        GamingPcBuilder gamingPcBuilder1 = new GamingPcBuilder();
        director.constructGaming1PC(gamingPcBuilder1);

        GamingPcBuilder gamingPcBuilder2 = new GamingPcBuilder();
        director.constructGaming2PC(gamingPcBuilder2);

        //office builder
        OfficePcBuilder officePcBuilder = new OfficePcBuilder();
        director.constructOfficePC(officePcBuilder);

        System.out.println("\nWelcome to computer company");
        System.out.println("What type of computers do you need?");
        System.out.println("1. Gaming 1");
        System.out.println("2. Gaming 2");
        System.out.println("3. Office");

        int numG = 0, numO = 0;
        String choose;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextLine().toLowerCase(Locale.ROOT);
        ArrayList<PC> PcClub = new ArrayList<>();

        switch (choose) {
            case "1", "gaming 1" -> {
                System.out.println("Enter the number of gaming computers");
                numG = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < numG; i++) {
                    PcClub.add(i, gamingPcBuilder1.getResult());
                }
            }

            case "2", "gaming 2" -> {
                System.out.println("Enter the number of gaming computers");
                numG = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < numG; i++) {
                    PcClub.add(i, gamingPcBuilder2.getResult());
                }
            }

            case "3", "office" -> {
                System.out.println("Enter the number of office computers");
                numO = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < numO; i++) {
                    PcClub.add(i, officePcBuilder.getResult());
                }
            }
        }

        for (int i = 0; i < PcClub.size(); i++) {
           System.out.println((i+1) + ". pcClub: " + PcClub.get(i).getPcType() + "\t" + PcClub.get(i).hashCode() + PcClub.get(i));
        }

    }
}

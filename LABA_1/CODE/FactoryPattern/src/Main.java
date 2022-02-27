import Factories.EasyLevel;
import Factories.HardLevel;
import Interfaces.IHorde;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        IHorde[] levels = new IHorde[] { // инициализируем уровни сложности, пользователь будет их выбирать
                new EasyLevel(),
                new HardLevel(),
        };

        System.out.println("\nВыберете уровень сложности и введите его номер:");

        for (int i = 0; i < levels.length; i++){ // выведем все уровни сложности пользователю
            System.out.println((i+1) + ". " + levels[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int levelNumber = scanner.nextInt() - 1;

        if(levelNumber > -1 && levelNumber < levels.length){

            Game game = new Game(levels[levelNumber]); // создаём игру с выбранным уровнем сложности
            game.StartGame();
        }
        else{
            System.out.println("Недопустимое число");
        }
    }
}

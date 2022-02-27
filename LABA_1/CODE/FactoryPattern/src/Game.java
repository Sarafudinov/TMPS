import GameObj.Hero;
import GameObj.Tree;
import Interfaces.*;
import java.util.concurrent.TimeUnit;

public class Game {

    private final Location Azeroth;

    public Game(IHorde factory)
    {
        Hero gamer = new Hero(); // В игре должен быть главный герой, за которого бы будем играть

        Tree[] trees = new Tree[] { // Задаём список деревьев, которые будут на локации
                new Tree(),
                new Tree(),
                new Tree()
        };

        IEnemy[] enemies = new IEnemy[100]; // Задаём список монстров на локации

        for(int i = 0; i < enemies.length; i++) {
            enemies[i] = factory.create(); // заполнение массива делегировано фабричному методу
        }

        Azeroth = new Location(enemies, trees); // инициализируем игровую локацию
    }

    public void StartGame()
    {

        System.out.println("~~~~~~~~~~~~~~~~~~~~LOADING~~~~~~~~~~~~~~~~~~~");
        try {
            TimeUnit.SECONDS.sleep(2);

        System.out.println("Локация загружена");
        System.out.println("Деревья расставлены");
        System.out.println("Монстры на местах");
        System.out.println("Игрок загружен");

            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~Start Game~~~~~~~~~~~~~~~~~~");
        System.out.println("На локации: ");

        Azeroth.enemiesArmyInfo(); // Выведем инфу о том, сколько и каких типов быдло у нас сгенерилось

    }

}

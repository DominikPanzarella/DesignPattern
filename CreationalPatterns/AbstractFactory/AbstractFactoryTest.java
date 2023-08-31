package AbstractFactory;

import CommonClasses.*;

public class AbstractFactoryTest
{

    public static void main(String[] args)
    {
        MazeGame game = new MazeGame();
        EnchantedMazeGame enchantedMazeGame = new EnchantedMazeGame();
        BombedMazeGame bombedMazeGame = new BombedMazeGame();

        MazeFactory normalFactory = new MazeFactory();
        EnchantedMazeFactory enchantedMazeFactory = new EnchantedMazeFactory();
        BombedMazeFactory bombedMazeFactory = new BombedMazeFactory();

        game.createMaze(normalFactory);
        enchantedMazeGame.createMaze(enchantedMazeFactory);
        bombedMazeGame.createMaze(bombedMazeFactory);

    }
}

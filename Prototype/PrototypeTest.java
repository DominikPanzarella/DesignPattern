package Prototype;

import CommonClasses.*;

public class PrototypeTest
{

    public static void main(String[] args)
    {
        MazeGame game = new MazeGame();
        MazePrototypeFactory simpleMazeFactory = new MazePrototypeFactory(new Maze(),new Wall(),new Room(), new Door());
        Maze maze = game.createMaze(simpleMazeFactory);

        MazePrototypeFactory bombedMazeFactory = new MazePrototypeFactory(new Maze(),new BombedWall(),new RoomWithABomb(), new Door());
        Maze bombedMaze = game.createMaze(bombedMazeFactory);
    }
}

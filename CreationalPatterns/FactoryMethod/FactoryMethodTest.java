package FactoryMethod;

import CommonClasses.*;

public class FactoryMethodTest
{

    public static void main(String[] args)
    {
        Maze maze;
        BombedMazeGame bombedGame = new BombedMazeGame();
        maze = bombedGame.createMaze();




    }
}

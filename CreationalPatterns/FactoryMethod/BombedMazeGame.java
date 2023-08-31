package FactoryMethod;

import CommonClasses.MazeGame;
import CommonClasses.Room;
import CommonClasses.RoomWithABomb;
import CommonClasses.Wall;
import CommonClasses.BombedWall;

public class BombedMazeGame extends MazeGame
{

    public BombedMazeGame(){
        System.out.println("FactoryMethod.BombedMazeGame()");
    }

    @Override
    public Room makeRoom(final int roomNumber)
    {
        return new RoomWithABomb(roomNumber);
    }

    @Override
    public Wall makeWall()
    {
        return new BombedWall();
    }

}

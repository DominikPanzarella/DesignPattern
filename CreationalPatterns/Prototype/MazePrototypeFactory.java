package Prototype;

import CommonClasses.MazeFactory;
import CommonClasses.Maze;
import CommonClasses.Room;
import CommonClasses.Wall;
import CommonClasses.Door;


public class MazePrototypeFactory extends MazeFactory
{
    private Maze prototypeMaze;
    private Wall prototypeWall;
    private Room prototypeRoom;

    private Door prototypeDoor;

    public MazePrototypeFactory(final Maze maze, final Wall wall,final Room room, final Door door)
    {
        this.prototypeMaze = maze;
        this.prototypeWall = wall;
        this.prototypeRoom = room;
        this.prototypeDoor = door;
    }
    @Override
    public Maze makeMaze()
    {
        return prototypeMaze.clone();
    }

    @Override
    public Door makeDoor(final Room room1,final Room room2)
    {
        return prototypeDoor.clone();
    }

    @Override
    public Wall makeWall()
    {
        return prototypeWall.clone();
    }

    @Override
    public Room makeRoom(final int roomNumber)
    {
        return prototypeRoom.clone();
    }

}

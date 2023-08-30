package AbstractFactory;


/*
* MazeFactory acts as both the AbstractFactory and the ConcreteFactory. This is a common simple application of the Abstract Factory Design Pattern
* */
public class MazeFactory
{

    private static MazeFactory __instance;          //Singleton

    static
    {
        __instance = null;
    }

    public MazeFactory(){
        System.out.println("MazeFactory.MazeFactory()");
    }

    public MazeFactory instance()
    {
        if(__instance==null)
            __instance = new MazeFactory();
        return __instance;
    }

    public Maze makeMaze()
    {
        return new Maze();
    }

    public Door makeDoor(final Room room1,final Room room2)
    {
        return new Door(room1,room2);
    }

    public Wall makeWall()
    {
        return new Wall();
    }

    public Room makeRoom(final int roomNumber)
    {
        return new Room(roomNumber);
    }




}

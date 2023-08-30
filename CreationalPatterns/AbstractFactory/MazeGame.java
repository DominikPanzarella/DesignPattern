package AbstractFactory;

public class MazeGame
{

    public MazeGame()
    {
        //Empty Constructor
        System.out.println("MazeGame.MazeGame()");
    }

    public Maze createMaze()
    {
        //System.out.println("MazeGame.createMaze()");
        Maze aMaze = new Maze();
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Door theDoor = new Door(r1,r2);

        r1.setSide(Direction.NORTH,new Wall());
        r1.setSide(Direction.EAST,theDoor);
        r1.setSide(Direction.SOUTH,new Wall());
        r1.setSide(Direction.WEST,new Wall());

        r2.setSide(Direction.NORTH,new Wall());
        r2.setSide(Direction.EAST,new Wall());
        r2.setSide(Direction.SOUTH,new Wall());
        r2.setSide(Direction.WEST,theDoor);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        return aMaze;
    }

    public Maze createMaze(MazeFactory factory)
    {
        //System.out.println("MazeGame.createMaze(MazeFactory)");
        Maze aMaze = factory.makeMaze();
        Room r1 = factory.makeRoom(1);
        Room r2 = factory.makeRoom(2);
        Door aDoor = factory.makeDoor(r1,r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Direction.NORTH,factory.makeWall());
        r1.setSide(Direction.EAST,aDoor);
        r1.setSide(Direction.SOUTH,factory.makeWall());
        r1.setSide(Direction.WEST,factory.makeWall());

        r2.setSide(Direction.NORTH,factory.makeWall());
        r2.setSide(Direction.EAST,factory.makeWall());
        r2.setSide(Direction.SOUTH,factory.makeWall());
        r2.setSide(Direction.WEST,aDoor);

        return aMaze;
    }

    // Factory Methods
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

package CommonClasses;

import Builder.MazeBuilder;

public class MazeGame
{

    public MazeGame()
    {
        //Empty Constructor
        System.out.println("MazeGame()");
    }

    /*

    // createMaze basic version using object's constructor
    public CommonClasses.Maze createMaze()
    {
        //System.out.println("CommonClasses.MazeGame.createMaze()");
        CommonClasses.Maze aMaze = new CommonClasses.Maze();
        CommonClasses.Room r1 = new CommonClasses.Room(1);
        CommonClasses.Room r2 = new CommonClasses.Room(2);
        CommonClasses.Door theDoor = new CommonClasses.Door(r1,r2);

        r1.setSide(CommonClasses.Direction.NORTH,new CommonClasses.Wall());
        r1.setSide(CommonClasses.Direction.EAST,theDoor);
        r1.setSide(CommonClasses.Direction.SOUTH,new CommonClasses.Wall());
        r1.setSide(CommonClasses.Direction.WEST,new CommonClasses.Wall());

        r2.setSide(CommonClasses.Direction.NORTH,new CommonClasses.Wall());
        r2.setSide(CommonClasses.Direction.EAST,new CommonClasses.Wall());
        r2.setSide(CommonClasses.Direction.SOUTH,new CommonClasses.Wall());
        r2.setSide(CommonClasses.Direction.WEST,theDoor);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        return aMaze;
    }

     */

    public Maze createMaze(final MazeFactory factory)
    {
        //System.out.println("CommonClasses.MazeGame.createMaze(CommonClasses.MazeFactory)");
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

    // createMaze implemented by factory methods
    public Maze createMaze()
    {
        Maze aMaze = makeMaze();

        Room r1 = makeRoom(1);
        Room r2 = makeRoom(2);
        Door theDoor = makeDoor(r1,r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Direction.NORTH,makeWall());
        r1.setSide(Direction.EAST,theDoor);
        r1.setSide(Direction.SOUTH,makeWall());
        r1.setSide(Direction.WEST,makeWall());

        r2.setSide(Direction.NORTH,makeWall());
        r2.setSide(Direction.EAST,makeWall());
        r2.setSide(Direction.SOUTH,makeWall());
        r2.setSide(Direction.WEST,theDoor);

        return aMaze;
    }


    public Maze createMaze(final MazeBuilder builder)
    {
        builder.buildMaze();
        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1,2);
        return builder.getMaze();
    }

    public Maze createComplexMaze(final MazeBuilder builder)
    {
        builder.buildRoom(1);
        // ...
        builder.buildRoom(1001);
        return builder.getMaze();
    }



    // Factory Methods
    public Maze makeMaze()
    {
        return new Maze();
    }

    public Door makeDoor(final Room room1, final Room room2)
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

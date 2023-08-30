package Builder;

public class BombedMazeFactory extends MazeFactory
{

    public BombedMazeFactory()
    {
        System.out.println("BombedMazeFactory.BombedMazeFactory()");
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

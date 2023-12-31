package CommonClasses;

public class BombedMazeGame extends MazeGame
{

    public BombedMazeGame(){
        System.out.println("BombedMazeGame()");
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

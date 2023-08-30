package Builder;

/*
* This builder does not create a maze at all;
* it just count the different kinds of components
* that would have been created.
*
* */
public class CountingMazeBuilder extends MazeBuilder
{
    private int numberOfRooms;
    private int numberOfDoors;

    public CountingMazeBuilder()
    {
        numberOfDoors = 0;
        numberOfRooms = 0;
    }

    @Override
    public void buildMaze(){ }

    @Override
    public void buildRoom(final int roomNumber)
    {
        numberOfRooms++;
    }

    @Override
    public void buildDoor(final int roomFrom, final int roomTo)
    {
        numberOfDoors++;
    }

    public int[] getCounts()
    {
        int[] getCounts = new int[2];
        getCounts[0] = numberOfRooms;
        getCounts[1] = numberOfDoors;
        return getCounts;
    }
}

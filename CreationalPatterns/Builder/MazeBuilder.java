package Builder;

public abstract class MazeBuilder
{

    protected MazeBuilder(){ }

    public void buildMaze(){ }

    public void buildDoor(final int roomFrom, final int roomTo){ }

    public Maze getMaze(){ return null; }

    public void buildRoom(final int roomNumber){ }
}

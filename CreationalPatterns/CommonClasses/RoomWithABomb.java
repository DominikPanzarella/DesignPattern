package CommonClasses;

public class RoomWithABomb extends Room
{

    private boolean isBombPresent;

    public RoomWithABomb(){
        super();
        this.isBombPresent = false;
    }

    public RoomWithABomb(final int roomNumber)
    {
        super(roomNumber);
        this.isBombPresent = false;
    }

    public RoomWithABomb(final int roomNumber, final boolean isBombPresent)
    {
        super(roomNumber);
        this.isBombPresent = isBombPresent;
    }

    public RoomWithABomb(RoomWithABomb fromRoom)
    {
        super(fromRoom);
        this.isBombPresent = fromRoom.isBombPresent;
    }

    public boolean isBombPresent()
    {
        return isBombPresent;
    }

    @Override
    public Room clone(){
        return new RoomWithABomb(this);
    }


}

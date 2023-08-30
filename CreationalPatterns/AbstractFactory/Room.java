package AbstractFactory;

import java.util.Arrays;
import java.util.Random;

public class Room extends MapSite {
    private int roomNumber;
    private final MapSite[] sides;

    public Room()
    {
        this.roomNumber = 0;
        this.sides = new MapSite[4];
    }

    public Room(int roomNumber)
    {
        this.roomNumber = roomNumber;
        sides = new MapSite[4];
    }

    public Room(Room fromRoom)                                     //Copy Constructor
    {
        this.roomNumber = fromRoom.roomNumber;
        this.sides = Arrays.copyOf(fromRoom.sides,fromRoom.sides.length);
    }

    public MapSite getSide(Direction dir)
    {
        return sides[dir.ordinal()];
    }

    public void setSide(Direction dir,MapSite newMapSite)
    {
        sides[dir.ordinal()] = newMapSite;
    }

    public int getRoomNumber()
    {
        return this.roomNumber;
    }

    public void setRoomNumber(final int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    @Override
    public void Enter()
    {
        //empty method
        System.out.println("Room.Enter()");
    }
}

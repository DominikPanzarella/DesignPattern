package AbstractFactory;

import java.util.ArrayList;

public class Maze
{
    private final ArrayList<Room> allRooms;

    public Maze()
    {
        allRooms = new ArrayList<>();
    }

    public Maze(Maze fromMaze)
    {
        this.allRooms = new ArrayList<>(fromMaze.allRooms);
    }

    public Maze(ArrayList<Room> allRooms)
    {
        this.allRooms = new ArrayList<>(allRooms);
    }

    public void addRoom(Room newRoom)
    {
        //allRooms.add(new Room(newRoom));
        allRooms.add(newRoom);
    }


    //Returns a REFERENCE to the room with number as searchNumber
    public Room roomNumber(int searchNumber)
    {
        if(searchNumber<0 || searchNumber>allRooms.size())
            return null;
        Room roomToReturn = null;
        for(var e : allRooms)
        {
            if(e.getRoomNumber() == searchNumber)
                roomToReturn = e;
        }
        return roomToReturn;
    }
}

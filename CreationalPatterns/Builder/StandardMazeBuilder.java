package Builder;

import CommonClasses.*;

public class StandardMazeBuilder extends MazeBuilder
{
    private Maze currentMaze;

    public StandardMazeBuilder(){
        currentMaze = null;
    }

    @Override
    public void buildMaze(){
        currentMaze = new Maze();
    }

    @Override
    public void buildRoom(final int roomNumber)
    {
        if(currentMaze.roomNumber(roomNumber)==null){
            Room newRoom = new Room(roomNumber);
            currentMaze.addRoom(newRoom);

            newRoom.setSide(Direction.NORTH, new Wall());
            newRoom.setSide(Direction.SOUTH, new Wall());
            newRoom.setSide(Direction.EAST, new Wall());
            newRoom.setSide(Direction.WEST, new Wall());

        }
    }

    @Override
    public void buildDoor(final int roomFrom,final int roomTo)
    {
        Room room1 = new Room(roomFrom);
        Room room2 = new Room(roomTo);
        Door newDoor = new Door(room1,room2);


        room1.setSide(commonWall(room1,room2),newDoor);
        room2.setSide(commonWall(room2,room1),newDoor);
    }

    public Direction commonWall(final Room room1, final Room room2)
    {
        return (room1.getRoomNumber() < room2.getRoomNumber())?Direction.EAST:Direction.WEST;
    }

}

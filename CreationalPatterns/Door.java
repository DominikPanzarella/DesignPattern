package Builder;

public class Door extends MapSite {
    private final Room room1;
    private final Room room2;
    private boolean isOpen;

    public Door(){
        room1 = null;
        room2 = null;
        isOpen = false;
    }

    public Door(Room room1, Room room2)
    {
        /*
        this.room1 = new Room(room1);
        this.room2 = new Room(room2);
        */
        this.room1 = room1;
        this.room2 = room2;
        this.isOpen = false;
    }

    public Door(Door fromDoor)
    {
        /*this.room1 = new Room(fromDoor.room1);
        this.room2 = new Room(fromDoor.room2);*/
        this.room1 = fromDoor.room1;
        this.room2 = fromDoor.room2;
        this.isOpen = fromDoor.isOpen;
    }

    @Override
    public void Enter() {
        this.isOpen = true;
    }


}

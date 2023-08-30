public class EnchantedMazeGame extends MazeGame
{

    public EnchantedMazeGame()
    {
        //Empty Constructor
        System.out.println("EnchantedMazeGame.EnchantedMazeGame()");
    }

    @Override
    public Door makeDoor(final Room room1, final Room room2)
    {
        return new DoorNeedingSpell(room1,room2);
    }

    @Override
    public Room makeRoom(final int roomNumber)
    {
        return new EnchantedRoom(roomNumber, castSpell());
    }

    protected Spell castSpell(){
        return new Spell();
    }

}

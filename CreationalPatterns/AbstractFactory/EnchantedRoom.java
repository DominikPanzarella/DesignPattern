package AbstractFactory;

public class EnchantedRoom extends Room
{
    private Spell spell;

    public EnchantedRoom(final int roomNumber,Spell aSpell)
    {
        super(roomNumber);
        this.spell = aSpell;
    }

}

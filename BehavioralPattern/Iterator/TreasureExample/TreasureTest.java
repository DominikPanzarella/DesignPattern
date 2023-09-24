package BehavioralPattern.Iterator.TreasureExample;

import static BehavioralPattern.Iterator.TreasureExample.ItemType.*;

public class TreasureTest
{
    private static final TreasureChest TREASURE_CHEST = new TreasureChest();

    private static void demonstrateTreasureChestIteratorForType(ItemType itemType)
    {
        System.out.println("------------------------");
        System.out.println("Item Iterator for ItemType "+itemType+": ");
        var itemIterator = TREASURE_CHEST.iterator(itemType);
        while(itemIterator.hasNext())
            System.out.println(itemIterator.next().toString());
    }

    public static void main(String[] args)
    {
        demonstrateTreasureChestIteratorForType(RING);
        demonstrateTreasureChestIteratorForType(POTION);
        demonstrateTreasureChestIteratorForType(WEAPON);
        demonstrateTreasureChestIteratorForType(ANY);
    }
}

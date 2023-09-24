package BehavioralPattern.Iterator.TreasureExample;

import java.util.Iterator;

public class Item
{
    private ItemType type;
    private final String name;

    public Item(ItemType type,String name)
    {
        this.type = type;
        this.name = name;
    }

    public ItemType getType(){ return type; }

    public String getName(){ return name; }

    public void setType(ItemType type){ this.type = type; }

    @Override public String toString(){ return "["+name+","+type.toString()+"]"; }




}

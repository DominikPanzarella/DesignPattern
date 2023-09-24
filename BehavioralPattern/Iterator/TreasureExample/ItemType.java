package BehavioralPattern.Iterator.TreasureExample;

public enum ItemType
{
    ANY("any"),
    WEAPON("weapon"),
    RING("ring"),
    POTION("potion");

    private final String title;

    ItemType(String title){ this.title = title; }

    @Override public String toString(){ return title; }
}

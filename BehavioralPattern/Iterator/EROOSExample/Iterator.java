package BehavioralPattern.Iterator.EROOSExample;

import BehavioralPattern.Iterator.TreasureExample.IteratorOutOfBounds;

public interface Iterator<T>
{
    void first();
    void next();
    boolean isDone();
    T currentItem() throws IteratorOutOfBounds;
}

package BehavioralPattern.Iterator.EROOSExample;

import BehavioralPattern.Iterator.TreasureExample.IteratorOutOfBounds;

import java.util.List;

public class SkipListIterator<T> extends ListIterator<T> {


    public SkipListIterator(final List<T> aList)
    {
        super(aList);
    }

    public SkipListIterator(final SkipList<T> skipList){
        super(skipList.theList);
    }
}

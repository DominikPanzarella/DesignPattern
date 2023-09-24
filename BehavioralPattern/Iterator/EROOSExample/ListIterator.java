package BehavioralPattern.Iterator.EROOSExample;

import BehavioralPattern.Iterator.TreasureExample.IteratorOutOfBounds;

import java.util.List;

public class ListIterator<T> implements Iterator<T>
{
    private final List<T> theList;
    private int current;

    public ListIterator(final List<T> aList)
    {
        theList = aList;
        current = 0;


    }

    @Override
    public void first() {
        current = 0;
    }

    @Override
    public void next() {
        current++;
    }

    @Override
    public boolean isDone() {
        return current >= theList.size();
    }

    @Override
    public T currentItem() throws IteratorOutOfBounds {
        if(isDone())    throw new IteratorOutOfBounds("Iterator out of bounds!");
        return  theList.get(current);
    }
}

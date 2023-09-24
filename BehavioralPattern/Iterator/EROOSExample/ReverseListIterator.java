package BehavioralPattern.Iterator.EROOSExample;

import BehavioralPattern.Iterator.TreasureExample.IteratorOutOfBounds;

import java.util.List;

public class ReverseListIterator<T> implements Iterator<T>
{
    private final List<T> theList;
    private int current;

    public ReverseListIterator(final List<T> aList)
    {
        theList = aList;
        current = 0;


    }

    @Override
    public void first() {
        current = theList.size()-1;
    }

    @Override
    public void next() {
        current--;
    }

    @Override
    public boolean isDone() {
        return current < 0;
    }

    @Override
    public T currentItem() throws IteratorOutOfBounds {
        if(isDone())    throw new IteratorOutOfBounds("Iterator out of bounds!");
        return  theList.get(current);
    }
}

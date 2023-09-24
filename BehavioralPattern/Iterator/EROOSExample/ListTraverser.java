package BehavioralPattern.Iterator.EROOSExample;

import BehavioralPattern.Iterator.TreasureExample.IteratorOutOfBounds;

import java.util.List;

public abstract class ListTraverser<T>
{
    private ListIterator<T> iterator;


    public ListTraverser(List<T> aList)
    {
        iterator = new ListIterator<>(aList);
    }

    public boolean traverse() throws IteratorOutOfBounds {
        boolean result = false;
        for(
                iterator.first();
                !iterator.isDone();
                iterator.next()
        ){
            result = processItem(iterator.currentItem());

            if(!result) break;
        }

        return result;
    }

    protected abstract boolean processItem(final T item);


}

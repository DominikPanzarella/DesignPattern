package BehavioralPattern.Iterator.EROOSExample;

import BehavioralPattern.Iterator.TreasureExample.IteratorOutOfBounds;

import java.util.List;
import java.util.function.Predicate;

public abstract class FilteringListTraverser<T>
{
    private final ListIterator<T> iterator;
    private Predicate<T> testObject;

    public FilteringListTraverser(List<T> aIterator,Predicate<T> aPredicate)
    {
        iterator = new ListIterator<>(aIterator);
        testObject = aPredicate;
    }

    public boolean traverse() throws IteratorOutOfBounds {
        boolean result = false;

        for(
                iterator.first();
                !iterator.isDone();
                iterator.next()
        ){
            if(testitem(iterator.currentItem()))
            {
                result = processItem(iterator.currentItem());

                if(!result) break;
            }
        }
        return result;
    }

    protected abstract boolean processItem(final T item);

    protected boolean testitem(final T item)
    {
        return testObject.test(item);
    }

}

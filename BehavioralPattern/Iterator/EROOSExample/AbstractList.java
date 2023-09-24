package BehavioralPattern.Iterator.EROOSExample;

import java.util.List;

public abstract class AbstractList<T>
{
    final List<T> theList;

    public AbstractList(List<T> aList)
    {
        theList = aList;
    }

    public abstract Iterator<T> createIterator();
}

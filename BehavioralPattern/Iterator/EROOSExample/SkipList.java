package BehavioralPattern.Iterator.EROOSExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class SkipList<T> extends AbstractList<T>{

    public SkipList(List<T> aList) {
        super(aList);
    }

    public SkipList()
    {
        super(new ArrayList<>());
    }

    @Override
    public Iterator<T> createIterator() {
        return new SkipListIterator<T>(this.theList);
    }


    public void add(T e)
    {
        if(!theList.isEmpty())
            theList.add(e);
    }
}

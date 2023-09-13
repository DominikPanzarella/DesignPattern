package StructuralPattern.Adapter.Example4;

import java.util.Enumeration;
import java.util.Iterator;

/*
Adapter that adapts an Iterator as an Enumeration

 */
public class IteratorEnumeration implements Enumeration {
    Iterator iterator;

    public IteratorEnumeration(Iterator iterator)
    {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}

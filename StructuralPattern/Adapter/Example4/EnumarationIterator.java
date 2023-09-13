package StructuralPattern.Adapter.Example4;

import java.util.Enumeration;
import java.util.Iterator;

/*
* Adapter that adapts an Enumeration as an Iterator
*
* */

public class EnumarationIterator implements Iterator
{
    Enumeration enumeration;

    public EnumarationIterator(Enumeration enumeration)
    {
        this.enumeration = enumeration;
    }


    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

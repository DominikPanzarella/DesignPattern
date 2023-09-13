package StructuralPattern.Composite.Example2;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public abstract class LetterComposite
{
    protected final List<LetterComposite> children = new ArrayList<>();

    public LetterComposite()
    {
    }

    public int count()
    {
        return children.size();
    }

    public void add(LetterComposite letter)
    {
        System.out.println("Operation not supported for this type of element");
    }

    public void remove(LetterComposite letter)
    {
        System.out.println("Operation not supported for this type of element");
    }

    public List<? extends LetterComposite> getComposite()
    {
        return null;
    }

    protected void printThisBefore()
    {
        // A word always have a space before it
    }

    protected void printThisAfter()
    {
        // A sentence always ends with a full stop
    }

    public void print()
    {
        printThisBefore();;
        children.forEach(LetterComposite::print);
        printThisAfter();
    }


}

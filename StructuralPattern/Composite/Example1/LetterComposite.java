package StructuralPattern.Composite.Example1;

import java.util.ArrayList;
import java.util.List;

public abstract class LetterComposite
{
    private final List<LetterComposite> children = new ArrayList<>();

    public LetterComposite()
    {
    }

    public void add(LetterComposite newLetter)
    {
        children.add(newLetter);
    }

    public int count()
    {
        return children.size();
    }

    protected void printThisAfter()
    {

    }

    protected void printThisBefore()
    {

    }

    public void print()
    {
        printThisBefore();
        children.forEach(LetterComposite::print);
        printThisAfter();
    }



}

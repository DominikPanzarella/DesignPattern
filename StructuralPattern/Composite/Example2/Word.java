package StructuralPattern.Composite.Example2;

import java.util.List;

public class Word
    extends LetterComposite
{

    public Word(List<Letter> letters)
    {
        letters.forEach(this::add);
    }

    public Word(char...letters)
    {
        for(var letter : letters)
            add(new Letter(letter));
    }

    @Override
    public void add(LetterComposite letter){
        children.add(letter);
    }

    @Override
    public void remove(LetterComposite letter)
    {
        children.remove(letter);
    }

    @Override
    protected void printThisBefore()
    {
        System.out.print(" ");
    }

    @Override
    public List<? extends LetterComposite> getComposite()
    {
        return children;
    }
}

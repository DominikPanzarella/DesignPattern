package StructuralPattern.Composite.Example1;

import java.util.List;

public class Word
    extends LetterComposite
{

    public Word(List<Letter> letters)
    {
        letters.forEach(this::add);
    }

    public Word(char... letters)
    {
        for(var letter : letters)
            this.add(new Letter(letter));
    }

    @Override
    protected void printThisBefore()
    {
        System.out.print(" ");
    }
}

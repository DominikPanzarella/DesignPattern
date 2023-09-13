package StructuralPattern.Composite.Example2;

import javax.naming.OperationNotSupportedException;

public class Letter
    extends LetterComposite
{

    private final char letter;

    public Letter(char letter)
    {
        this.letter = letter;
    }

    @Override
    public void printThisBefore() {
        System.out.print(letter);
    }

}

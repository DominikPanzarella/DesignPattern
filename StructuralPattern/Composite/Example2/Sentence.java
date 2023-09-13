package StructuralPattern.Composite.Example2;

import javax.naming.OperationNotSupportedException;
import java.util.List;

public class Sentence
    extends LetterComposite
{

    public Sentence(List<Word> words)
    {
        words.forEach(this::add);
    }

    @Override
    public void add(LetterComposite letter){
        children.add(letter);
    }

    @Override
    public void remove(LetterComposite letter){
        children.remove(letter);
    }

    @Override
    protected void printThisAfter() {
        System.out.print(".");
    }

    @Override
    public List<? extends LetterComposite> getComposite()
    {
        return children;
    }
}

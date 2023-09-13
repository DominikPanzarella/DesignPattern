package StructuralPattern.Composite.Example2;

import StructuralPattern.Composite.Example1.LetterComposite;
import StructuralPattern.Composite.Example1.Sentence;
import StructuralPattern.Composite.Example1.Word;

import javax.naming.OperationNotSupportedException;
import java.util.List;

public class Messenger
{

    public LetterComposite messageFromOrcs()
    {
        var words = List.of(
                new Word('W', 'h', 'e', 'r', 'e'),
                new Word('t', 'h', 'e', 'r', 'e'),
                new Word('i', 's'),
                new Word('a'),
                new Word('w', 'h', 'i', 'p'),
                new Word('t', 'h', 'e', 'r', 'e'),
                new Word('i', 's'),
                new Word('a'),
                new Word('w', 'a', 'y')
        );

        return new Sentence(words);
    }

    public LetterComposite messageFromElves() {

        var words = List.of(
                new Word('M', 'u', 'c', 'h'),
                new Word('w', 'i', 'n', 'd'),
                new Word('p', 'o', 'u', 'r', 's'),
                new Word('f', 'r', 'o', 'm'),
                new Word('y', 'o', 'u', 'r'),
                new Word('m', 'o', 'u', 't', 'h')
        );

        return new Sentence(words);

    }

    public static void main(String[] args){
        /*
        var messenger = new Messenger();
        System.out.print("Message from the orcs: ");
        messenger.messageFromOrcs().print();

        System.out.print("\nMessage from the elves: ");
        messenger.messageFromElves().print();*/

        var words = List.of(
                new Word('W', 'h', 'e', 'r', 'e'),
                new Word('t', 'h', 'e', 'r', 'e'),
                new Word('i', 's'),
                new Word('a'),
                new Word('w', 'h', 'i', 'p'),
                new Word('t', 'h', 'e', 'r', 'e'),
                new Word('i', 's'),
                new Word('a'),
                new Word('w', 'a', 'y')
        );
        var sentence = new Sentence(words);
        //sentence.print();
        Letter l = new Letter('a');
        l.add(new Letter('b'));


    }

}

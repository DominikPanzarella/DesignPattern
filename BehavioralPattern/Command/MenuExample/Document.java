package BehavioralPattern.Command.MenuExample;

public class Document
{
    public Document(final String name)
    {
        System.out.println("Constructing document"+name+".");
    }

    public void open()
    {
        System.out.println("Document.open()");
    }

    public void paste()
    {
        System.out.println("Document.paste()");
    }
}

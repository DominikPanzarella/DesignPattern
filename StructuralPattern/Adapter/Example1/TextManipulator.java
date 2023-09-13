package StructuralPattern.Adapter.Example1;

public class TextManipulator implements Manipulator{
    private TextShape textShape;

    public TextManipulator(final TextShape newTextShape)
    {
        textShape = newTextShape;
    }
}

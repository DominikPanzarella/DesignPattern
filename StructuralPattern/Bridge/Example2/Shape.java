package StructuralPattern.Bridge.Example2;

public abstract class Shape
{
    protected final Color color;

    public Shape(Color color)
    {
        this.color = color;
    }

    abstract void applyColor();

}

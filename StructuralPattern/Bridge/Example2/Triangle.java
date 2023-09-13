package StructuralPattern.Bridge.Example2;

public class Triangle
    extends Shape
{


    public Triangle(Color color)
    {
        super(color);
    }

    @Override
    void applyColor()
    {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }
}

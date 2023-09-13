package StructuralPattern.Decorator.Sturbuzz;

public abstract class Beverage
{

    private String description;
    private Size size;

    public Beverage()
    {
        this.description = "Unknown Beverage";
    }

    public Beverage(String description)
    {
        this.description = description;
        this.size = Size.TALL;
    }

    public Beverage(String description,Size size)
    {
        this.description = description;
        this.size = size;
    }

    public String getDescription()
    {
        return size.getSizeName()+" "+description;
    }

    public Size getSize()
    {
        return this.size;
    }

    public void setSize(Size size)
    {
        this.size = size;
    }

    public abstract double cost();
}

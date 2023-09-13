package StructuralPattern.Decorator.Sturbuzz;

public class DarkRoast
    extends Beverage
{

    public DarkRoast()
    {
        super("DarkRoast");
    }

    @Override
    public double cost() {
        return .99 + getSize().getCost();
    }
}

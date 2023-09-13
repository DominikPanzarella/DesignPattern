package StructuralPattern.Decorator.Sturbuzz;

public class HouseBlend
    extends Beverage
{

    public HouseBlend()
    {
        super("House Blend Coffe");
    }

    @Override
    public double cost() {
        return .89 + getSize().getCost();
    }


}

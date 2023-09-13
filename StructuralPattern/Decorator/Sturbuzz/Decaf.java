package StructuralPattern.Decorator.Sturbuzz;

public class Decaf
    extends Beverage
{

    public Decaf()
    {
        super("Decaf");
    }

    @Override
    public double cost() {
        return 1.05 + getSize().getCost();
    }
}

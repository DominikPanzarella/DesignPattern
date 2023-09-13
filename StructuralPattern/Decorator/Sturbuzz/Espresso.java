package StructuralPattern.Decorator.Sturbuzz;

public class Espresso
    extends Beverage
{

    public Espresso()
    {
        super("Espresso");
    }

    @Override
    public double cost() {
        return 1.99 + getSize().getCost();
    }
}

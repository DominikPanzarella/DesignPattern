package StructuralPattern.Decorator.Sturbuzz;

public abstract class CondimentDecorator
    extends Beverage
{

    Beverage beverageComponent;

    public CondimentDecorator(final Beverage beverageComponent)
    {
        this.beverageComponent = beverageComponent;
    }

    public abstract String getDescription();

}

package StructuralPattern.Decorator.Sturbuzz;

public class Whip
    extends CondimentDecorator
{

    public Whip(Beverage beverageComponent) {
        super(beverageComponent);
    }

    @Override
    public double cost() {
        return 0.1 + beverageComponent.cost();
    }

    @Override
    public String getDescription() {
        return beverageComponent.getDescription()+", Whip";
    }
}

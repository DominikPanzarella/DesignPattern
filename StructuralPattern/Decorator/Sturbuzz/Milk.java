package StructuralPattern.Decorator.Sturbuzz;

public class Milk
        extends CondimentDecorator
{


    public Milk(Beverage beverageComponent) {
        super(beverageComponent);
    }

    @Override
    public double cost() {
        return 0.1 + beverageComponent.cost();
    }

    @Override
    public String getDescription() {
        return beverageComponent.getDescription()+", Milk";
    }
}

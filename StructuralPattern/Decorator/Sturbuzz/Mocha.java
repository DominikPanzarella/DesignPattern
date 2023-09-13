package StructuralPattern.Decorator.Sturbuzz;

public class Mocha
    extends CondimentDecorator
{


    public Mocha(Beverage beverageComponent) {
        super(beverageComponent);
    }

    @Override
    public double cost() {
        return .20 + beverageComponent.cost();
    }

    @Override
    public String getDescription() {
        return beverageComponent.getDescription() + ", Mocha";
    }
}

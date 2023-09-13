package StructuralPattern.Decorator.Sturbuzz;

public class Soy
    extends CondimentDecorator
{


    public Soy(Beverage beverageComponent) {
        super(beverageComponent);
    }

    @Override
    public double cost() {
        return 0.15 + beverageComponent.cost();
    }

    @Override
    public String getDescription() {
        return beverageComponent.getDescription()+", Soy";
    }
}

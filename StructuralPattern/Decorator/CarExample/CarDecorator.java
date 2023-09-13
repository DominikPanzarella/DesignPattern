package StructuralPattern.Decorator.CarExample;

public abstract class CarDecorator
        implements Car {

    private final Car carComponent;

    public CarDecorator(final Car carComponent)
    {
        this.carComponent = carComponent;
    }

    @Override
    public void assemble()
    {
        this.carComponent.assemble();
    }

}

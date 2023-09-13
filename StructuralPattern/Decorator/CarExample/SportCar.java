package StructuralPattern.Decorator.CarExample;

public class SportCar
    extends CarDecorator
{


    public SportCar(final Car carComponent) {
        super(carComponent);
    }

    @Override
    public void assemble()
    {
        super.assemble();
        System.out.println("Adding features of Sport Car...");
    }
}

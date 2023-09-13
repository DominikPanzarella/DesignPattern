package StructuralPattern.Decorator.CarExample;

public class LuxuryCar
    extends CarDecorator
{

    public LuxuryCar(final Car carComponent)
    {
        super(carComponent);
    }

    @Override
    public void assemble()
    {
        super.assemble();
        System.out.println("Adding features of Luxury Car...");
    }
}

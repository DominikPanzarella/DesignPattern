package StructuralPattern.Decorator.CarExample;

public class BasicCar
    implements Car
{


    @Override
    public void assemble() {
        System.out.println("Basic car assembling...");
    }
}

package StructuralPattern.Decorator.CarExample;

public class CarTest
{

    public static void main(String[] args)
    {
        System.out.println("Basic car.");
        var car = new BasicCar();
        car.assemble();

        System.out.println("\nCreating a brand-new car.");
        var sportCar = new SportCar(new BasicCar());
        sportCar.assemble();

        System.out.println("\nCustomizing the basic car.");
        var luxuryCar = new LuxuryCar(car);
        luxuryCar.assemble();

    }
}

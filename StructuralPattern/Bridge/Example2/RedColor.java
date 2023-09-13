package StructuralPattern.Bridge.Example2;

public class RedColor
    implements Color
{

    @Override
    public void applyColor() {
        System.out.println("red.");
    }
}

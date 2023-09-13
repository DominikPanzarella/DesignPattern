package StructuralPattern.Bridge.Example2;

public class GreenColor
    implements Color
{


    @Override
    public void applyColor() {
        System.out.println("green.");
    }
}

package StructuralPattern.Proxy.TowerExample;

public class Wizard
{

    private final String name;

    public Wizard(final String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }
}

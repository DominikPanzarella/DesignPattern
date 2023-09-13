package StructuralPattern.FoundationClasses;

public class Coord
{
    private double value;
    public Coord()
    {
        value = 0.;
    }

    public Coord(final double value)
    {
        this.value = value;
    }

    public Coord(final Coord fromCoord)
    {
        this.value = fromCoord.value;
    }

    public static Coord copyFrom(final Coord fromCoord)
    {
        return new Coord(fromCoord.getCoordValue());
    }

    public static Coord min(final Coord x,final Coord y)
    {
        return new Coord(Math.min(x.value,y.value));
    }

    public static Coord max(final Coord x,final Coord y)
    {
        return new Coord(Math.max(x.value,y.value));
    }

    public static Coord abs(final Coord x)
    {
        return new Coord(Math.abs(x.value));
    }

    public static Coord round(final Coord x)
    {
        return new Coord(Math.round(x.value));
    }

    public Coord getCoord(){ return this; }

    public double getCoordValue(){ return value; }

    public void setCoord(final double newValue){ value = newValue; }

    public void setCoord(final Coord fromCoord){ this.setCoord(fromCoord.value); }




}

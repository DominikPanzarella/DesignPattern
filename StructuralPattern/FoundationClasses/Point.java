package StructuralPattern.FoundationClasses;

public class Point
{
    private Coord x;
    private Coord y;

    public Point()
    {
        x = new Coord();
        y = new Coord();
    }

    public Point(final Coord x, final Coord y)
    {
        this.x = new Coord(x);
        this.y = new Coord(y);
    }

    public Point(final Point fromPoint)
    {
        x = fromPoint.x;
        y = fromPoint.y;
    }

    public static Point copyFrom(final Point fromPoint)
    {
        return new Point(fromPoint);
    }

    public void setCoord(final Coord fromX,final Coord y)
    {
        this.x = Coord.copyFrom(fromX);
        this.y = Coord.copyFrom(y);
    }


    public Coord getX()
    {
        return x;
    }

    public Coord getY()
    {
        return y;
    }

}

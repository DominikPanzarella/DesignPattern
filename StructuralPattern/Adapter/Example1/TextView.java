package StructuralPattern.Adapter.Example1;

import StructuralPattern.FoundationClasses.Coord;

public class TextView
{
    private Coord x;
    private Coord y;
    private Coord height;
    private Coord width;

    public TextView(){

    }

    public void getOrigin(Coord toX, Coord toY)
    {
        toX.setCoord(x);
        toY.setCoord(y);
    }

    public void getExtent(Coord toWidth,Coord toHeight)
    {
        toWidth.setCoord(width);
        toHeight.setCoord(height);

    }

    public boolean isEmpty()
    {
        return ((width.getCoordValue()==0.) || (height.getCoordValue() == 0.));
    }
}

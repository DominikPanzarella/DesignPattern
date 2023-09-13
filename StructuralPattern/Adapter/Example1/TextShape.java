package StructuralPattern.Adapter.Example1;

import StructuralPattern.FoundationClasses.Coord;
import StructuralPattern.FoundationClasses.Point;

//Class adapter
public class TextShape implements Shape{

    private final TextView text;

    public TextShape(TextView text)
    {

        this.text = text;
    }

    @Override
    public void BoundingBox(Point bottomLeft, Point topRight) {
        Coord bottom = new Coord();
        Coord left = new Coord();
        Coord width = new Coord();
        Coord height = new Coord();

        text.getOrigin(bottom,left);
        text.getExtent(width,height);

        bottomLeft.setCoord(bottom,left);
        topRight.setCoord(new Coord(bottom.getCoordValue()+height.getCoordValue()),new Coord(left.getCoordValue()+width.getCoordValue()));


    }

    @Override
    public Manipulator createManipulator() {
        return new TextManipulator(this);
    }

}

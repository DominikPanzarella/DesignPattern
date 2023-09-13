package StructuralPattern.Adapter.Example1;

import StructuralPattern.FoundationClasses.Point;

public interface Shape {


    void BoundingBox(final Point bottomLeft, final Point topRight);

    Manipulator createManipulator();


}

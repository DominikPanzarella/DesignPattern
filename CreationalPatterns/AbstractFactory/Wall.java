package AbstractFactory;

import java.util.Map;

public class Wall extends MapSite {

    public Wall(){
        //Empty Default Constructor
        //System.out.println("Wall.Wall()");
    }

    public Wall(final Wall fromWall)
    {
        //Empty Copy Constructor
        //System.out.println("Wall.Wall(Wall)");
    }

    @Override
    public void Enter()
    {
        //Empty Method
        System.out.println("Wall.Enter()");
    }
}

package CommonClasses;

public class Wall extends MapSite {

    public Wall(){
        //Empty Default Constructor
        //System.out.println("CommonClasses.Wall.CommonClasses.Wall()");
    }

    public Wall(final Wall fromWall)
    {
        //Empty Copy Constructor
        //System.out.println("CommonClasses.Wall.CommonClasses.Wall(CommonClasses.Wall)");
    }

    @Override
    public void Enter()
    {
        //Empty Method
        System.out.println("CommonClasses.Wall.Enter()");
    }

    @Override
    public Wall clone()
    {
        return new Wall(this);
    }
}

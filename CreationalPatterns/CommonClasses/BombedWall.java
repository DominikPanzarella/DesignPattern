package CommonClasses;

public class BombedWall extends Wall
{
    private boolean isBombPresent;

    public BombedWall()
    {
        super();
        isBombPresent = false;
    }

    public BombedWall(final boolean isBombPresent)
    {
        super();
        this.isBombPresent = isBombPresent;
    }

    public BombedWall(final BombedWall fromWall)
    {
        isBombPresent = fromWall.isBombPresent;
    }

    @Override
    public Wall clone(){
        return new BombedWall(this);
    }

    public boolean isBombPresent()
    {
        return isBombPresent;
    }
}

package StructuralPattern.Adapter.Example2;

public class BoatTest
{

    public static void main(String[] args)
    {
        var captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}

package StructuralPattern.Bridge.Example1;

public class SoulEatingEnchantment
    implements Enchantment
{

    @Override
    public void onActivete()
    {
        System.out.println("The item spreads bloodlust.");
    }

    @Override
    public void apply()
    {
        System.out.println("The item eats the soul of enemies.");
    }

    @Override
    public void onDeactivate()
    {
        System.out.println("Bloodlust slowly disappears.");
    }
}

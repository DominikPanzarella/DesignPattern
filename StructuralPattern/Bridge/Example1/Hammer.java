package StructuralPattern.Bridge.Example1;

import CommonClasses.Wall;

public class Hammer
        implements Weapons
{

    private final Enchantment enchantment;

    public Hammer(Enchantment enchantment)
    {
        this.enchantment = enchantment;
    }
    @Override
    public void wield() {
        System.out.println("The hammer is wielded.");
        enchantment.onActivete();
    }

    @Override
    public void swing() {
        System.out.println("The hammer is swinged.");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        System.out.println("The hammer is unwielded.");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}

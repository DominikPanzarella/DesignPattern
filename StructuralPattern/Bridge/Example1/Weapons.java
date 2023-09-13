package StructuralPattern.Bridge.Example1;

/*
* Weapons can also be implemented as an abstract class
* */
public interface Weapons
{
    void wield();
    void swing();
    void unwield();
    Enchantment getEnchantment();

}

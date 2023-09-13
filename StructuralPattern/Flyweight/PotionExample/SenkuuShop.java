package StructuralPattern.Flyweight.PotionExample;

import java.util.List;

public class SenkuuShop
{

    private final List<Potion> topShelf;
    private final List<Potion> bottomShelf;

    public SenkuuShop() {
        var factory = new PotionFactory();
        topShelf = List.of(
                factory.createPotion(InvisibilityPotion.class),
                factory.createPotion(InvisibilityPotion.class),
                factory.createPotion(StrengthPotion.class),
                factory.createPotion(HealingPotion.class),
                factory.createPotion(InvisibilityPotion.class),
                factory.createPotion(StrengthPotion.class),
                factory.createPotion(HealingPotion.class),
                factory.createPotion(HealingPotion.class)
        );
        bottomShelf = List.of(
                factory.createPotion(Poision.class),
                factory.createPotion(Poision.class),
                factory.createPotion(Poision.class),
                factory.createPotion(HolyWaterPotion.class),
                factory.createPotion(HolyWaterPotion.class)
        );
    }

    public final List<Potion> getTopShelf()
    {
        return List.copyOf(topShelf);
    }

    public final List<Potion> getBottomShelf()
    {
        return List.copyOf(bottomShelf);
    }

    public void drinkPotions()
    {
        System.out.println("Drinking top shelf potions");
        topShelf.forEach(Potion::drink);
        System.out.println("Drinking bottom shelf potions");
        bottomShelf.forEach(Potion::drink);
    }


}

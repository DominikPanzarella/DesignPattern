package StructuralPattern.Flyweight.PotionExample;

public class StrengthPotion
    implements Potion
{


    @Override
    public void drink() {
        System.out.printf("You feel strong. [Potion=%s]%n",hashCode());
    }
}

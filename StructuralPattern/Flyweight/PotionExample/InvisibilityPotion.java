package StructuralPattern.Flyweight.PotionExample;

public class InvisibilityPotion
    implements Potion
{

    @Override
    public void drink() {
        System.out.printf("You become invisible. [Potion=%s]%n",hashCode());
    }
}

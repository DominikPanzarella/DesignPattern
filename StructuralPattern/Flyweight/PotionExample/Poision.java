package StructuralPattern.Flyweight.PotionExample;

public class Poision
    implements Potion
{


    @Override
    public void drink() {
        System.out.printf("Urgh! This is poisonous. [Potion=%s]%n",hashCode());
    }
}

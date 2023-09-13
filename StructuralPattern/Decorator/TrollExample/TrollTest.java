package StructuralPattern.Decorator.TrollExample;

public class TrollTest
{

    public static void main(String[] args)
    {
        System.out.println("A simple looking troll approaches!");
        var troll = new SimpleTroll();
        troll.attack();
        System.out.printf("Simple troll power: %d%n",troll.getAttackPower());
        troll.fleeBattle();

        System.out.printf("%nA troll with a huge club surprises you!%n");
        var clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        System.out.printf("Clubbed troll power: %d%n",clubbedTroll.getAttackPower());
        clubbedTroll.fleeBattle();

    }
}

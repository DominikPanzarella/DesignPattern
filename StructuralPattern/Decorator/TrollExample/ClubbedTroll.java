package StructuralPattern.Decorator.TrollExample;

public class ClubbedTroll
    implements  Troll
{

    private final Troll component;

    public ClubbedTroll(final Troll component)
    {
        this.component = component;
    }

    @Override
    public void attack() {
        component.attack();
        System.out.println("The troll swings at you with a club!");
    }

    @Override
    public int getAttackPower() {
        return component.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        component.fleeBattle();
        System.out.println("The troll dropped his club!");
    }
}

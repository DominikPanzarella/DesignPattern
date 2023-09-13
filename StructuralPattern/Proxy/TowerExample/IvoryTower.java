package StructuralPattern.Proxy.TowerExample;

public class IvoryTower
    implements Tower
{
    @Override
    public void enter(Wizard wizard) {
        System.out.printf("%s enters the tower.%n",wizard);
    }
}

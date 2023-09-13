package StructuralPattern.Proxy.TowerExample;

public class WizardTowerProxy
    implements Tower
{
    private static final int NUM_WIZARD_ALLOWED = 3;

    private int currentWizards;
    private final Tower tower;

    public WizardTowerProxy(final Tower tower)
    {
        this.tower = tower;
    }


    @Override
    public void enter(Wizard wizard) {
        if(currentWizards < NUM_WIZARD_ALLOWED)
        {
            tower.enter(wizard);
            currentWizards++;
        }
        else
            System.out.printf("%s is not allowed to enter! [Full tower]%n",wizard);
    }
}

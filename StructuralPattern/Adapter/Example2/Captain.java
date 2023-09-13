package StructuralPattern.Adapter.Example2;

public class Captain
{
    private RowingBoat rowingBoat;

    public Captain(final RowingBoat rowingBoat)
    {
        this.rowingBoat = rowingBoat;
    }

    public void row()
    {
        rowingBoat.row();
    }
}

package StructuralPattern.Decorator.Sturbuzz;

public enum Size {

    TALL("Tall",0.10),
    GRANDE("Grande",0.15),
    VENTI("Venti",0.2);
    private final String sizeName;
    private final double cost;

    Size(String sizeName,double cost)
    {
        this.sizeName = sizeName;
        this.cost = cost;
    }

    public double getCost()
    {
        return this.cost;
    }

    public String getSizeName()
    {
        return this.sizeName;
    }
}

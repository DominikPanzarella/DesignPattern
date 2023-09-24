package BehavioralPattern.Iterator.EROOSExample;

import java.util.List;

public class PrintNValues<T> extends ListTraverser<T>
{
    private int total;
    private int count;

    public PrintNValues(List<T> aList, int n) {
        super(aList);
        this.total = n;
        this.count = 0;
    }

    @Override
    protected boolean processItem(T item) {
        count++;
        System.out.println(item);
        return count < total;
    }
}

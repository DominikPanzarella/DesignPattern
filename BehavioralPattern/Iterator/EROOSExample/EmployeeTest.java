package BehavioralPattern.Iterator.EROOSExample;

import BehavioralPattern.Iterator.TreasureExample.IteratorOutOfBounds;
import com.sun.net.httpserver.Filter;

import java.util.ArrayList;
import java.util.*;
import java.util.function.Predicate;


public class EmployeeTest
{
    private static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee());
        employees.add(new Employee());
        employees.add(new Employee());
        employees.add(new Employee());
    }
    private static void printEmployee(Iterator<Employee> iter)
            throws IteratorOutOfBounds
    {
        for(iter.first(); !iter.isDone(); iter.next())
            iter.currentItem().print();
    }

    private static void testList()
            throws IteratorOutOfBounds
    {
        ListIterator<Employee> forward = new ListIterator<>(employees);
        ReverseListIterator<Employee> backward = new ReverseListIterator<>(employees);
        System.out.println("---Forward List---");
        printEmployee(forward);
        System.out.println("---Backward List---");
        printEmployee(backward);

    }

    private static void testSkipList()
            throws IteratorOutOfBounds
    {
        SkipList<Employee> skipList = new SkipList<>(employees);
        SkipListIterator<Employee> it = new SkipListIterator<>(skipList);
        printEmployee(it);
    }

    private static void testInteralIterator()
            throws IteratorOutOfBounds
    {
        PrintNValues<Employee> pn = new PrintNValues<>(employees, 10);
        pn.traverse();
    }

    private static void testFilteringIterator() throws IteratorOutOfBounds {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(10);
        numbers.add(7);
        numbers.add(2);

        FilteringListTraverser<Integer> it = new FilteringListTraverser<>(numbers, n -> n>=5) {
            @Override
            protected boolean processItem(Integer item) {
                System.out.println("[" + item+ "]");
                return true;
            }
        };

        it.traverse();

    }

    public static void main(String[] args)
    {

        try{
            //testList();
            //testSkipList();
            //testInteralIterator();
            testFilteringIterator();
        }
        catch (IteratorOutOfBounds e) { }

    }
}

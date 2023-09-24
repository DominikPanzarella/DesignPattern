package BehavioralPattern.Iterator.EROOSExample;

public class Employee
{
    public void print(){ System.out.println(toString());}

    @Override public String toString(){ return "[Employee "+this.hashCode()+"]"; }
}

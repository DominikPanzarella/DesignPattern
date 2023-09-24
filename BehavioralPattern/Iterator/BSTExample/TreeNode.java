package BehavioralPattern.Iterator.BSTExample;

import com.sun.source.tree.Tree;

public class TreeNode<T extends Comparable<T>>
{
    private final T val;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T val)
    {
        this.val = val;
        left = null;
        right = null;
    }

    public T getVal(){ return val; }

    public TreeNode<T> getLeft(){ return left; }

    public void setLeft(TreeNode<T> left){ this.left = left; }

    public TreeNode<T> getRight(){ return right; }

    public void setRight(TreeNode<T> right){ this.right = right; }

    private boolean isGreaterThan(T val){ return this.val.compareTo(val)>  0; }

    private boolean isLessThanOrEqualTo(T val){ return this.val.compareTo(val) < 1;}

    private TreeNode<T> getParentNodeOfValueToBeInserted(T valToInsert)
    {
        TreeNode<T> parent = null;
        var curr = this;

        while(curr != null)
        {
            parent = curr;
            curr = curr.traverseOneLevelDown(valToInsert);
        }
        return parent;
    }

    private TreeNode<T> traverseOneLevelDown(T value)
    {
        if (this.isGreaterThan(value))      return this.left;
        else                                return this.right;
    }

    private void insertNewChild(T valToInsert)
    {
        if (this.isLessThanOrEqualTo(valToInsert))      this.setRight(new TreeNode<>(valToInsert));
        else                                            this.setLeft(new TreeNode<>(valToInsert));
    }

    public void insert(T valToInsert)
    {
        var parent = getParentNodeOfValueToBeInserted(valToInsert);
        parent.insertNewChild(valToInsert);
    }

    @Override public String toString(){ return val.toString(); }


}

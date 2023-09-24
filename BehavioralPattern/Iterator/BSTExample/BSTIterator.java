package BehavioralPattern.Iterator.BSTExample;

import BehavioralPattern.Iterator.TreasureExample.Iterator;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class BSTIterator<T extends Comparable<T>> implements Iterator<TreeNode<T>>
{
    private final ArrayDeque<TreeNode<T>> pathStack;

    public BSTIterator(TreeNode<T> root)
    {
        this.pathStack = new ArrayDeque<>();
        pushPathToNextSmallest(root);
    }

    private void pushPathToNextSmallest(TreeNode<T> node)
    {

        while(node != null)
        {
            pathStack.push(node);
            node = node.getLeft();
        }
    }
    @Override
    public boolean hasNext() {
        return !pathStack.isEmpty();
    }

    @Override
    public TreeNode<T> next()
        throws NoSuchElementException
    {
        if(pathStack.isEmpty()) throw new NoSuchElementException();

        var next = pathStack.pop();
        pushPathToNextSmallest(next.getRight());
        return next;
    }
}

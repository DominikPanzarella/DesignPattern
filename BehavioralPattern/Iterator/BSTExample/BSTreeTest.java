package BehavioralPattern.Iterator.BSTExample;

public class BSTreeTest
{

    private static void demonstrateBstIterator() {
        System.out.println("------------------------");
        System.out.println("BST Iterator: ");
        var root = buildIntegerBst();
        var bstIterator = new BSTIterator<>(root);
        while (bstIterator.hasNext()) {
            System.out.println("Next node: " + bstIterator.next().getVal());
        }
    }

    private static TreeNode<Integer> buildIntegerBst() {
        var root = new TreeNode<>(8);

        root.insert(3);
        root.insert(10);
        root.insert(1);
        root.insert(6);
        root.insert(14);
        root.insert(4);
        root.insert(7);
        root.insert(13);

        return root;
    }

    public static void main(String[] args)
    {
        demonstrateBstIterator();
    }
}

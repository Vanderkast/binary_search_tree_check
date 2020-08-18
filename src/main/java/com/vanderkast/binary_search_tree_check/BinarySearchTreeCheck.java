package com.vanderkast.binary_search_tree_check;

import com.vanderkast.binary_search_tree_check.comparator.ValueComparator;

public class BinarySearchTreeCheck<V> {
    private final ValueComparator<V> comparator;

    public BinarySearchTreeCheck(ValueComparator<V> comparator) {
        this.comparator = comparator;
    }

    /**
     * recursive method
     * that determines whether tree is binary search tree
     *
     * @return true if tree represents binary search tree, otherwise false
     */
    public boolean isBinarySearch(TreeNode<V> root) {
        if (root.getValue() == null)
            return true;

        boolean isLeftChildTree = true, isRightChildTree = true;
        if (root.getLeft() != null)
            isLeftChildTree = isBinarySearch(root.getLeft());
        if (root.getRight() != null)
            isRightChildTree = isBinarySearch(root.getRight());

        return (root.getLeft() == null || comparator.compare(root, root.getLeft()) > 0)
                && (root.getRight() == null || comparator.compare(root, root.getRight()) < 0)
                && isLeftChildTree
                && isRightChildTree;
    }
}

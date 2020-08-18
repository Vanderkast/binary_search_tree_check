package com.vanderkast.binary_search_tree_check.comparator;

import com.vanderkast.binary_search_tree_check.TreeNode;

@FunctionalInterface
public interface ValueComparator<V> {
    /**
     *  return positive, zero or negative
     *  if a value is bigger, equal or less
     *  then b value
     */
    int compare(TreeNode<V> a, TreeNode<V> b);
}

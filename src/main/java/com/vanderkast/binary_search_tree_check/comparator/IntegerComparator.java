package com.vanderkast.binary_search_tree_check.comparator;

import com.vanderkast.binary_search_tree_check.TreeNode;

public class IntegerComparator implements ValueComparator<Integer> {
    @Override
    public int compare(TreeNode<Integer> a, TreeNode<Integer> b) {
        if(a.getValue().equals(b.getValue()))
            return 0;
        return a.getValue() > b.getValue() ? 1 : -1;
    }
}
